package uv.djdm.todo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateTodoDTO {
    
    @NotNull
    @Size(max = 50)
    private String title;

    @NotNull
    @Size(max = 1000)
    private String description;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}