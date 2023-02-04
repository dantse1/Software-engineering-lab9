/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.miu.cs.cs425.studentmgmt.Services;

import edu.miu.cs.cs425.studentmgmt.models.Classroom;

/**
 *
 * @author Daniel Tsegay Meresie
 */
public interface IClassroomService {
    
    Classroom getClassroomById(Integer classroomId);
}
