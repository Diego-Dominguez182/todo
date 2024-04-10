package uv.djdm.todo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import uv.djdm.todo.dto.CreateTodoDTO;
import uv.djdm.todo.dto.TodoDTO;
import uv.djdm.todo.service.TodoService;

@RestController
public class ToDoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/obtenerTodos")
    public List<TodoDTO> getAll(){
        return todoService.getAll();
    }


    @RequestMapping("/crearToDo")
    public TodoDTO create (@Valid @RequestBody CreateTodoDTO data){
        return todoService.create(data);
    }
}
