package edu.miu.cs.cs425.studentmgmt.repositories;

import edu.miu.cs.cs425.studentmgmt.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
