/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.miu.cs.cs425.studentmgmt.repositories;

import edu.miu.cs.cs425.studentmgmt.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {
    
}
