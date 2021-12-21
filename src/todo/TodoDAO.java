package todo;

public interface TodoDAO {
    // 메뉴관련
    void menuPrint();

    int menuSelect();

    void end();

    void cancle();

    int inputTodoId();

    // CRUD

    Todo selectOne(int todoId);

    void selectOne();

    // 메소드

}
