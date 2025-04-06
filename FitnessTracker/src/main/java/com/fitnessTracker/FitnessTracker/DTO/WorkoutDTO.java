package com.fitnessTracker.FitnessTracker.DTO;

import jakarta.persistence.Entity;

import lombok.Data;
import org.hibernate.jdbc.Work;

import java.util.Date;

@Data
public class WorkoutDTO {
    private Long Id;

    private String type;

    private Date date;

    private int duration;

    private int caloriesBurned;


}
