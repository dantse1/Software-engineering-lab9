package edu.miu.cs.cs425.studentmgmt.models;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.*;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private Double cgpa;
    private LocalDate dateOfEnrollment;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transcript_id", nullable = true)
    private Transcript transcript;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id", nullable = true)
    private Classroom classroom;

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment=" + dateOfEnrollment + '}';
    }

}
