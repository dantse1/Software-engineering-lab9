package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.Services.Implmentations.StudentService;
import edu.miu.cs.cs425.studentmgmt.models.Student;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student(null, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));
        Student saved = saveStudent(student);
        if(saved != null){
            System.out.println("The following student is saved successfully");
            System.out.println(saved);
        }
        else{
            System.out.println("unable to save a student");
        }
        Student saved2 = saveStudent(student);
    }

    private Student saveStudent(Student student) {
        return studentService.addStudent(student);
    }
}
