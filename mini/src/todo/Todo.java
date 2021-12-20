package todo;

import java.sql.Date;

public class Todo {
    private int todoId;
    private String todoContents;
    private Date todoDeadline;

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
}
