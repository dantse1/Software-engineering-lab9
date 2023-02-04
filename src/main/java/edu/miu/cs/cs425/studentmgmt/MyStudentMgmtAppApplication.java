package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.Services.Implmentations.ClassroomService;
import edu.miu.cs.cs425.studentmgmt.Services.Implmentations.StudentService;
import edu.miu.cs.cs425.studentmgmt.models.Classroom;

import edu.miu.cs.cs425.studentmgmt.models.Student;
import edu.miu.cs.cs425.studentmgmt.models.Transcript;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassroomService classroomService;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var transcript1 = new Transcript(null, "BS Computer Science", null);
        var classroom1 = new Classroom(null, "Verrill Hall", "V14", null);
        Student student1 = new Student(null, "000-61-0003", "Carlos", "J", "Hernandez", 3.87, LocalDate.of(2017, 5, 24), transcript1, classroom1);
        saveStudent(student1);
//        
        //classroom1 = classroomService.getClassroomById(1);//there is only one classroom
        
        var transcript2 = new Transcript(null, "BS Ele Science", null);
        var classroom2 = classroomService.getClassroomById(1);
        Student student2 = new Student(null, "000-61-0005", "Berbera", "Serano", "Silberan", 3.12, LocalDate.of(2015, 6, 24), transcript2, null);
        var savedStudent2 = saveStudent(student2);
        savedStudent2.setClassroom(classroom2);
        saveStudent(saveStudent(student2));
        
//        System.out.println(classroom1);
//        //classroom1.getStudents().add(student2);
//        //var savedStudent2 = saveStudent(student2);
//        //savedStudent2.setClassroom(classroom1);
//        studentService.addStudent(student2);
    }

    private Student saveStudent(Student student) {
        return studentService.addStudent(student);
    }
}
