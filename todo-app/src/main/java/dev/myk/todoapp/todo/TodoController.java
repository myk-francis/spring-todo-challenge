package dev.myk.todoapp.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping("/hello")
    String home() {
        return "Hello, Todos!";
    }
}
