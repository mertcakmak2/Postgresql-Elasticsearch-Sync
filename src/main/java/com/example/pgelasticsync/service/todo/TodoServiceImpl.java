package com.example.pgelasticsync.service.todo;

import com.example.pgelasticsync.model.Todo;
import com.example.pgelasticsync.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{

    private final TodoRepository repository;
    @Override
    public Todo addTodo(Todo todo) {
        return repository.save(todo);
    }
}
