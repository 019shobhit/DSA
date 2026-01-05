package dago.demo.service;

import dago.demo.dto.AddStudentRequestDTO;
import dago.demo.dto.StudentDTO;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDTO> getAllStudent();
    StudentDTO getStudentById(Long id);
    StudentDTO createNewStudent(AddStudentRequestDTO addStudentRequestDTO);
    void deleteStudentByID(Long id);
    StudentDTO updateStudent(Long id, AddStudentRequestDTO addStudentRequestDTO);

    StudentDTO updatePartialStudent(Long id, Map<String,Object> updates);
}
