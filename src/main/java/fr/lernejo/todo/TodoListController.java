package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    private final TodoRepository repo;

    public TodoListController(TodoRepository repo) {
        this.repo = repo;
    }

    @PostMapping("api/todo")
    public void add (TodoEntity element) {
        repo.save(element);
    }

    @GetMapping("api/todo")
    public Iterable<TodoEntity> get () {
        return this.repo.findAll();
    }






}
