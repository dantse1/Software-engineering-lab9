package edu.miu.cs.cs425.studentmgmt.Services;

import edu.miu.cs.cs425.studentmgmt.models.Student;

/**
 *
 * @author Daniel Tsegay Meresie
 */
public interface IStudentService {
    public Student addStudent(Student student);
    Student getStudentById(Long studentId);
    Student updateStudent(Student student);
}
