package com.fitnessTracker.FitnessTracker.Services.Activity;

import com.fitnessTracker.FitnessTracker.DTO.GoalDTO;
import com.fitnessTracker.FitnessTracker.DTO.WorkoutDTO;

import java.util.List;

public interface WorkoutService {
    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);
    List<WorkoutDTO> getWorkout();

}
