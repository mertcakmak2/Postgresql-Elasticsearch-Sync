package com.example.pgelasticsync.repository;

import com.example.pgelasticsync.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>  {
}
