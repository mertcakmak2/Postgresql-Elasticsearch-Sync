package com.example.pgelasticsync.controller;

import com.example.pgelasticsync.model.Todo;
import com.example.pgelasticsync.service.todo.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService service;

    @PostMapping("")
    public Todo addTodo(@RequestBody Todo todo){
        return service.addTodo(todo);
    }
}
