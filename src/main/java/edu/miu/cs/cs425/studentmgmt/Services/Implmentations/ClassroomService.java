/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.miu.cs.cs425.studentmgmt.Services.Implmentations;

import edu.miu.cs.cs425.studentmgmt.Services.IClassroomService;
import edu.miu.cs.cs425.studentmgmt.models.Classroom;
import edu.miu.cs.cs425.studentmgmt.repositories.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Service
public class ClassroomService implements IClassroomService {
    
    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Classroom getClassroomById(Integer classroomId) {
        return classroomRepository.findById(classroomId)
                .orElse(null);
    }
    
}
