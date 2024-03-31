package dev.myk.todoapp.todo;

import java.time.LocalDateTime;

public record Todo(
    Integer id, 
    String title, 
    String status, 
    LocalDateTime createdAt ,
    LocalDateTime updatedAt) {
}
