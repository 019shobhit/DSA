package dago.demo.controller;

import dago.demo.dto.AddStudentRequestDTO;
import dago.demo.dto.StudentDTO;
import dago.demo.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class studentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDTO>>getStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentByID(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDTO> createNewStudent(@RequestBody @Valid AddStudentRequestDTO addStudentRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentByID(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDTO addStudentRequestDTO) {
        return ResponseEntity.ok(studentService.updateStudent(id,addStudentRequestDTO));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDTO> updatePartialStudent(@PathVariable Long id,
                                                           @RequestBody Map<String,Object> updates) {
        return ResponseEntity.ok(studentService.updatePartialStudent(id,updates));
    }

}
