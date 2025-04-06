package com.fitnessTracker.FitnessTracker.Services.Activity;

import com.fitnessTracker.FitnessTracker.DTO.WorkoutDTO;
import com.fitnessTracker.FitnessTracker.Repository.WorkoutRepository;
import com.fitnessTracker.FitnessTracker.entity.Workout;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkoutServiceImpl implements WorkoutService{
    private final WorkoutRepository workoutRepository;

    public WorkoutDTO postWorkout(WorkoutDTO workoutDTO){
        Workout workout = new Workout();
        workout.setDate(workoutDTO.getDate());
        workout.setType(workoutDTO.getType());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurned(workoutDTO.getCaloriesBurned());
        return workoutRepository.save(workout).getWorkoutDTO();
    }

    public List<WorkoutDTO> getWorkout(){
        List<Workout> workouts=workoutRepository.findAll();
        return workouts.stream().map(Workout::getWorkoutDTO).collect(Collectors.toList());
    }
}
