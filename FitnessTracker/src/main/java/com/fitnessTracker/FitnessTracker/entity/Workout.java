package com.fitnessTracker.FitnessTracker.entity;

import com.fitnessTracker.FitnessTracker.DTO.WorkoutDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String type;

    private Date date;

    private int duration;

    private int caloriesBurned;

    public WorkoutDTO getWorkoutDTO(){
        WorkoutDTO workoutDTO = new WorkoutDTO();

        workoutDTO.setId(Id);
        workoutDTO.setType(type);
        workoutDTO.setDate(date);
        workoutDTO.setDuration(duration);
        workoutDTO.setCaloriesBurned(caloriesBurned);
        return workoutDTO;
    }
}
