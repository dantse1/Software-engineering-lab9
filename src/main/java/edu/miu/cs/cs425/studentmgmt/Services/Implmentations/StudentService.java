package edu.miu.cs.cs425.studentmgmt.Services.Implmentations;

import edu.miu.cs.cs425.studentmgmt.Services.IStudentService;
import edu.miu.cs.cs425.studentmgmt.models.Student;
import edu.miu.cs.cs425.studentmgmt.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Service
public class StudentService implements IStudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    
}
