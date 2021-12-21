package todo;

import java.sql.Date;

public class Todo {
    private int todoId;
    private String todoContents;
    private Date todoDeadline;
    private int playerId;

    public String getTodoContents() {
        return todoContents;
    }

    public Date getTodoDeadline() {
        return todoDeadline;
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoContents(String todoContents) {
        this.todoContents = todoContents;
    }

    public void setTodoDeadline(Date todoDeadline) {
        this.todoDeadline = todoDeadline;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "리스트번호 = " + todoId + ", 내용 = " + todoContents + ", 마감일 = " + todoDeadline + ", 작성자 = " + playerId;
    }

}
