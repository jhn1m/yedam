package player;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import common.DAO;

public class PlayerDAOImpl extends DAO implements PlayerDAO {

    private int id;
    private int chk;
    private String pwd;

    // 싱글톤
    private static PlayerDAOImpl instance = new PlayerDAOImpl();

    private PlayerDAOImpl() {
    }

    public static PlayerDAOImpl getInstance() {
        return instance;
    }

    @Override
    public void loginMenuPrint() {
        System.out.println("-------------------------------------");
        System.out.println("| 1. 로그인 | 2. 회원가입 | 9. 종료 |");
        System.out.println("-------------------------------------");
        System.out.print("선택 >> ");
    }

    @Override
    public void menuPrint() {
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println("| 1. 회원정보수정 | 2. 회원 탈퇴 | 3. 자신의 TODOLIST 열람 | 4. TODOLIST 작성 | 9. 종료 |");
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.print("선택 >> ");
        int menuNo = menuSelect();
        if (menuNo == 1) {
            updateMenuPrint();
            menuSelect();
            updatePlayer();
        } else if (menuNo == 2) {
            delete(id);
        } else if (menuNo == 3) {
            check(id);
        } else if (menuNo == 4) {
            insertTodo();
        } else if (menuNo == 9) {
            end();
            return;
        }
    }

    public int deleteCheck(int id, String pwd) {
        try {
            connect();

            // SQL
            String check = "SELECT * FROM player WHERE player_id = " + id + " AND player_pwd = ?";
            pstmt = conn.prepareStatement(check);
            pstmt.setString(1, pwd);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                return chk = 1;
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
                return chk = 2;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
        return 0;
    }

    public void delete(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자신의 계정을 삭제합니다.");
        System.out.println("삭제하시려면 비밀번호를 입력하세요.");
        System.out.print("비밀번호 >> ");
        deleteCheck(id, sc.next());

        if (chk == 1) {
            try {
                connect();
                // SQL
                String delete = "DELETE FROM player WHERE player_id = " + id;
                pstmt = conn.prepareStatement(delete);
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    System.out.println("삭제완료.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                disconnect();
            }
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }

    @Override
    public void updateMenuPrint() {
        System.out.println("----------------------------------------------");
        System.out.println("수정을 선택하셨습니다. 수정 메뉴를 선택하세요.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("| 1. 전체수정 | 2. 이름만 수정 | 3. 비밀번호 수정 | 4. 연락처 수정 | 9. 취소 |");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("선택 >> ");
    }

    @Override
    public int menuSelect() {
        Scanner sc = new Scanner(System.in);
        int menuNo = 0;
        try {
            menuNo = sc.nextInt();
        } catch (Exception e) {
            System.out.println("없는 메뉴입니다.");
        }
        return menuNo;
    }

    @Override
    public void end() {
        System.out.println("프로그램을 종료합니다.");
    }

    @Override
    public void cancle() {
        System.out.println("취소합니다.");
    }

    @Override
    public Player loginCheck(Player loginInfo) {
        Scanner sc = new Scanner(System.in);
        Player player = null;
        try {
            connect();

            // SQL
            String check = "SELECT * FROM player WHERE player_id = ? AND player_pwd = ?";

            pstmt = conn.prepareStatement(check);
            pstmt.setInt(1, loginInfo.getPlayerId());
            id = loginInfo.getPlayerId();
            pstmt.setString(2, loginInfo.getPlayerPwd());
            pwd = loginInfo.getPlayerPwd();
            rs = pstmt.executeQuery();

            if (rs.next()) {
                player = new Player();
                player.setPlayerId(rs.getInt("player_id"));
                player.setPlayerName(rs.getString("player_name"));
                player.setPlayerPwd(rs.getString("player_pwd"));
                player.setPlayerPhone(rs.getString("player_phone"));
                player.setPlayerProgress(rs.getInt("player_progress"));
                player.setPlayerRank(rs.getString("player_rank"));

                System.out.println(player.getPlayerName() + " 님 환영합니다.");
            } else {
                System.out.println("로그인 실패");
            }
        } catch (

        SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
            menuPrint();
        }
        return player;
    }

    public void check(int id) {
        Scanner sc = new Scanner(System.in);
        connect();
        String check = "SELECT count(*) FROM todo WHERE player_id = " + id;
        try {
            pstmt = conn.prepareStatement(check);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("현재 할 일의 갯수는 " + rs.getString("count(*)") + "개 입니다.");
                checkTodo(id);
            } else {
                System.out.println("할 일이 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Player pwdCheck(Player loginInfo) {
        Player player = null;
        try {
            connect();

            // SQL
            String check = "SELECT * FROM player WHERE player_id = ? AND player_pwd = ?";

            pstmt = conn.prepareStatement(check);
            pstmt.setInt(1, loginInfo.getPlayerId());
            pstmt.setString(2, loginInfo.getPlayerPwd());
            rs = pstmt.executeQuery();

            if (rs.next()) {
                player = new Player();
                player.setPlayerId(rs.getInt("player_id"));
                player.setPlayerName(rs.getString("player_name"));
                player.setPlayerPwd(rs.getString("player_pwd"));
                player.setPlayerPhone(rs.getString("player_phone"));
                player.setPlayerProgress(rs.getInt("player_progress"));
                player.setPlayerRank(rs.getString("player_rank"));
                System.out.println("비밀번호를 변경합니다.");
                updatePwdPlayer();
            } else {
                System.out.println("로그인 실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
        return player;
    }

    @Override
    public void loginCheck() {
        Player player = inputForLogin();
        loginCheck(player);
    }

    public void pwdCheck() {
        Player player = inputForLogin();
        pwdCheck(player);
    }

    @Override
    public void insert(Player player) {
        try {
            connect();

            // SQL
            String insert = "insert into player(player_id, player_name, player_pwd, player_phone) values(?, ?, ?, ?)";

            pstmt = conn.prepareStatement(insert);
            pstmt.setInt(1, player.getPlayerId());
            pstmt.setString(2, player.getPlayerName());
            pstmt.setString(3, player.getPlayerPwd());
            pstmt.setString(4, player.getPlayerPhone());

            int result = pstmt.executeUpdate();

            System.out.println(result + "건이 등록되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    @Override
    public void insertPlayer() {
        Player player = inputAll();
        insert(player);
    }

    @Override
    public Player inputAll() {
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        player = new Player();

        System.out.print("회원 번호 >> ");
        player.setPlayerId(sc.nextInt());

        System.out.print("회원 이름 >> ");
        player.setPlayerName(sc.next());

        System.out.print("회원 비밀번호 >> ");
        player.setPlayerPwd(sc.next());

        System.out.print("회원 전화번호 >> ");
        player.setPlayerPhone(sc.next());
        return player;
    }

    @Override
    public Player inputForLogin() {
        Player player = new Player();
        player = new Player();
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print("회원 아이디 >> ");
        player.setPlayerId(sc.nextInt());
        System.out.print("회원 비밀번호 >> ");
        player.setPlayerPwd(sc.next());
        return player;

    }

    @Override
    public Player inputForName() {
        Player player = new Player();
        player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호 >> ");
        player.setPlayerId(sc.nextInt());
        System.out.print("변경할 이름 >> ");
        player.setPlayerName(sc.next());
        return player;
    }

    @Override
    public Player inputForPwd() {
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호 >> ");
        player.setPlayerId(sc.nextInt());
        System.out.print("변경할 비밀번호 >> ");
        player.setPlayerPwd(sc.next());
        return player;
    }

    public Player inputForTodo() {
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호 >> ");
        player.setPlayerId(sc.nextInt());
        return player;
    }

    public Todo inputAllForTodo() {
        Todo todo = new Todo();
        Scanner sc = new Scanner(System.in);
        System.out.print("내용 >> ");
        todo.setTodoContents(sc.nextLine());
        System.out.print("완수 기한(년-월-일 순으로 입력) >> ");
        todo.setTodoDeadline((Date.valueOf(sc.next())));
        return todo;
    }

    public void checker() {
        connect();
        Scanner sc = new Scanner(System.in);
        System.out.println("다시 로그인 해주십시오.");
        System.out.print("회원 번호 >> ");
        String id = sc.next();
        System.out.print("회원 비밀번호 >> ");
        String pass = sc.next();
        String sql1 = "SELECT * FROM player WHERE player_id = " + id + " AND player_pwd = '" + pass + "'";
        try {
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                updatePwdPlayer();
            } else {
                System.out.println("비밀번호가 틀렸습니다");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    @Override
    public Player inputForPhone() {
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호 >> ");
        player.setPlayerId(sc.nextInt());
        System.out.print("변경할 연락처 >> ");
        player.setPlayerPhone(sc.next());
        return player;
    }

    @Override
    public int inputPlayerId() {
        int playerId = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호>> ");
        playerId = sc.nextInt();
        return playerId;
    }

    @Override
    public void updatePlayer() {
        int menuNo = menuSelect();
        if (menuNo == 1) {
            updateAllPlayer();
        } else if (menuNo == 2) {
            updateNamePlayer();
        } else if (menuNo == 3) {
            pwdCheck();
        } else if (menuNo == 4) {
            updatePhonePlayer();
        } else if (menuNo == 9) {
            cancle();
            return;
        }
    }

    @Override
    public void updateAllPlayer() {
        Player player = inputAll();
        updateAll(player);
    }

    @Override
    public void updateNamePlayer() {
        Player player = inputForName();
        updateName(player);
    }

    @Override
    public void updatePwdPlayer() {
        Player player = inputForPwd();
        updatePwd(player);
    }

    @Override
    public void updatePhonePlayer() {
        Player player = inputForPhone();
        updatePhone(player);
    }

    @Override
    public void updateAll(Player player) {
        try {
            connect();

            // SQL
            String update = "UPDATE player SET player_id = ?, player_name = ?, player_pwd = ?, player_phone = ? WHERE player_id = ?";
            pstmt = conn.prepareStatement(update);

            pstmt.setInt(1, player.getPlayerId());
            pstmt.setString(2, player.getPlayerName());
            pstmt.setString(3, player.getPlayerPwd());
            pstmt.setString(4, player.getPlayerPhone());
            pstmt.setInt(5, player.getPlayerId());

            int result = pstmt.executeUpdate();

            System.out.println(result + "건이 수정되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    @Override
    public void updateName(Player player) {
        try {
            connect();

            // SQL
            String update = "UPDATE player SET player_name = ? WHERE player_id = ?";
            pstmt = conn.prepareStatement(update);

            pstmt.setString(1, player.getPlayerName());
            pstmt.setInt(2, player.getPlayerId());

            int result = pstmt.executeUpdate();

            System.out.println(result + "건이 수정되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    @Override
    public void updatePwd(Player player) {
        try {
            connect();

            // SQL
            String update = "UPDATE player SET player_pwd = ? WHERE player_id = ?";
            pstmt = conn.prepareStatement(update);

            pstmt.setString(1, player.getPlayerPwd());
            pstmt.setInt(2, player.getPlayerId());

            int result = pstmt.executeUpdate();

            System.out.println(result + "건이 수정되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    @Override
    public void updatePhone(Player player) {
        try {
            connect();

            // SQL
            String update = "UPDATE player SET player_phone = ? WHERE player_id = ?";
            pstmt = conn.prepareStatement(update);

            pstmt.setString(1, player.getPlayerPhone());
            pstmt.setInt(2, player.getPlayerId());

            int result = pstmt.executeUpdate();

            System.out.println(result + "건이 수정되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    // TODO --------------------------------------------------------------

    public void insertTodo() {
        Todo todo = inputAllForTodo();
        insertTodo(todo);
    }

    public void insertTodo(Todo todo) {
        try {
            connect();
            Scanner sc = new Scanner(System.in);

            // SQL
            String insert = "INSERT INTO todo VALUES(todo_num.nextval, ?, ?, " + id + ")";

            pstmt = conn.prepareStatement(insert);

            pstmt.setString(1, todo.getTodoContents());
            pstmt.setDate(2, todo.getTodoDeadline());
            int result = pstmt.executeUpdate();

            System.out.println(result + "건이 삽입되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public List<Todo> checkTodo(int id) {
        List<Todo> list = new ArrayList<>();
        try {
            connect();
            stmt = conn.createStatement();

            // SQL
            rs = stmt.executeQuery("SELECT todo_contents, todo_deadline FROM todo where player_id = " + id);

            // RESULT
            while (rs.next()) {
                Todo todo = new Todo();
                todo.setTodoContents(rs.getString("todo_contents"));
                todo.setTodoDeadline(rs.getDate("todo_deadline"));
                list.add(todo);
                System.out.println("할 일 : " + todo.getTodoContents() + ", 마감일 : " + todo.getTodoDeadline());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }

        return list;
    }

}