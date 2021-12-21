package todo;

import java.sql.SQLException;
import java.util.Scanner;

import common.DAO;

public class TodoDAOImpl extends DAO implements TodoDAO {
    private static TodoDAOImpl instance = new TodoDAOImpl();

    private TodoDAOImpl() {
    }

    public static TodoDAOImpl getInstance() {
        return instance;
    }

    @Override
    public void menuPrint() {
        System.out.println("--------------------------------------");
        System.out.println("| 1. 미구현 | 2. 단일선택 | 9. 종료 |");
        System.out.println("--------------------------------------");
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
    public void selectOne() {
        int todoId = inputTodoId();
        Todo todo = selectOne(todoId);
        if (todo == null) {
            System.out.println(todoId + " : 없는 글입니다.");
        } else {
            System.out.println(todo);
        }
    }

    @Override
    public int inputTodoId() {
        int todoId = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("게시물 번호 >> ");
        todoId = sc.nextInt();
        return todoId;
    }

    @Override
    public Todo selectOne(int todoId) {
        Todo todo = new Todo();
        try {
            connect();
            stmt = conn.createStatement();

            // SQL
            String select = "SELECT * FROM todo WHERE todo_id = " + todoId;
            rs = stmt.executeQuery(select);
            while (rs.next()) {
                todo.setTodoId(rs.getInt("todo_id"));
                todo.setTodoContents(rs.getString("todo_contents"));
                todo.setTodoDeadline(rs.getDate("todo_deadline"));
                todo.setPlayerId(rs.getInt("player_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
        return todo;
    }

}