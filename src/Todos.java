import java.util.HashMap;

public class Todos {

    private HashMap<Integer, String> todos;

    void setTodos(HashMap<Integer, String> todos) {
        this.todos = todos;
    }
    HashMap<Integer, String> getTodos() {
        return todos;
    }

    void removeTodo(int key) {
        todos.remove(key);
    }

    @Override
    public String toString() {
        return todos.toString();
    }
}
