package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {

    private final ArrayList<Todo> liste = new ArrayList<>();

    @PostMapping("api/todo")
    public void add (Todo element) {
        liste.add(element);
    }

    @GetMapping("api/todo")
    public ArrayList<Todo> get () {
        return this.liste;
    }






}
