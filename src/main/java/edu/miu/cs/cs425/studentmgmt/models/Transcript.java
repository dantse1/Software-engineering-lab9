/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.miu.cs.cs425.studentmgmt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Entity
@Table(name = "transcripts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transcript {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;
    private String degreeProgram;
    
    @OneToOne(mappedBy = "transcript")
    private Student student; 

    @Override
    public String toString() {
        return "Transcript{" + "transcriptId=" + transcriptId + ", degreeProgram=" + degreeProgram + '}';
    }
    
}
