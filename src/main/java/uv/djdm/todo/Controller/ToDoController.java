package uv.djdm.todo.Controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uv.djdm.todo.Model.ToDo;

@RestController
public class ToDoController {

    private List<ToDo> todos;


    public ToDoController() {
        todos = new LinkedList<>();
        todos.add(new ToDo(1, "Primera tarea", "Proyecto spring", false));
        todos.add(new ToDo(1, "Primera tarea", "Proyecto spring", false));
    }

    @RequestMapping("/obtenerTodos")
    public List<ToDo> getAll(){
        return todos;
    }


}
