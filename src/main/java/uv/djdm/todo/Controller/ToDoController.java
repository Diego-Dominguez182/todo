package uv.djdm.todo.Controller;

import java.util.LinkedList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import uv.djdm.todo.Model.ToDo;
import uv.djdm.todo.dto.CreateTodoDTO;
import uv.djdm.todo.dto.TodoDTO;

@RestController
public class ToDoController {

    private List<ToDo> todos;
    private long currentId = 1;

    public ToDoController() {
        todos = new LinkedList<>();
        todos.add(new ToDo(1, "Diego", "Primer proyecto", false));
    }

    @RequestMapping("/obtenerTodos")
    public List<TodoDTO> getAll(){

        List<TodoDTO> data = new LinkedList<>();

        for (ToDo model : todos){
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
            data.add(dto);
        }
        return data;
    }


    @RequestMapping("/crearToDo")
    public TodoDTO create (@Valid @RequestBody CreateTodoDTO data){

        ToDo Model = new ToDo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(Model);
        TodoDTO dto = new TodoDTO();
        dto.setId(Model.getId());
        dto.setDescription(Model.getDescription());
        dto.setTitle(Model.getTitle());
        dto.setCompleted(Model.isCompleted());

        return dto;
        
    }
}
