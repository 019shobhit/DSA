package dago.demo.dto;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class AddStudentRequestDTO {
    String name;

    @Email
    String email;
    int age;
}
