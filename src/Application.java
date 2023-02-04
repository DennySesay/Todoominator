import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Title
        System.out.println("@@@@ Todo List @@@@");

        // Imports
        Scanner input = new Scanner(System.in);
        Todos todos = new Todos();
        HashMap<Integer, String> Todos = new HashMap<>();

        // Messages
        System.out.println("Add new todo!\n");
        System.out.println("Commands: \"stop\", \"todos\", \"help\"");

        // Main Loop Logic
        int count = 1;
        boolean running = true;

        // Main Loop
        while (running) {
            System.out.print("> ");
            String todoInput = input.nextLine();

            Todos.put(count, todoInput);
            count++;
            todos.setTodos(Todos);

            switch (todoInput) {
                case "stop" -> {
                    System.out.println(todos);
                    running = false;
                }
                case "todos" -> {
                    todos.removeTodo(count - 1);
                    System.out.println(todos);
                }
                case "help" -> {
                    todos.removeTodo(count - 1);
                    System.out.println("\"stop\" = Stops the Application\n\"todos\" = List of Todos");
                }
            }
        }
    }
}