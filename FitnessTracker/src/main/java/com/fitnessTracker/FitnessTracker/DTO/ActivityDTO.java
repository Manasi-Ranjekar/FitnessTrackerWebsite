package com.fitnessTracker.FitnessTracker.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ActivityDTO {
    private Long id;
    private int steps;
    private Date date;
    private double distance;
    private int caloriesBurned;
}
