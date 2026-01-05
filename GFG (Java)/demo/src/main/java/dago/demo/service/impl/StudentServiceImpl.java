package dago.demo.service.impl;

import dago.demo.dto.AddStudentRequestDTO;
import dago.demo.dto.StudentDTO;
import dago.demo.entity.Student;
import dago.demo.repository.StudentRepository;
import dago.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(student -> modelMapper
                .map(student, StudentDTO.class)).toList();
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);
        return studentDTO;
    }

    @Override
    public StudentDTO createNewStudent(AddStudentRequestDTO addStudentRequestDTO) {
        Student newStudent = modelMapper.map(addStudentRequestDTO, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public void deleteStudentByID(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Student with ID " + id + " does not exist");
        }

    }

    @Override
    public StudentDTO updateStudent(Long id, AddStudentRequestDTO addStudentRequestDTO) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student with ID " + id + " does not exist"));
        modelMapper.map(addStudentRequestDTO, student);
        student = studentRepository.save(student);
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public StudentDTO updatePartialStudent(Long id, Map<String, Object> updates) {
        Student student = studentRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Student with ID " + id + " does not exist"));
        updates.forEach((key, value) -> {
            switch (key) {
                case "name" -> student.setName((String) value);
                case "email" -> student.setEmail((String) value);
                case "age" -> student.setAge((Integer) value);
                default -> throw new IllegalArgumentException("Invalid field: " + key);
            }
        });
        Student newstudent = studentRepository.save(student);
        return modelMapper.map(newstudent, StudentDTO.class);
    }
}
