package com.fitnessTracker.FitnessTracker.Services.Activity;

import com.fitnessTracker.FitnessTracker.DTO.GoalDTO;

import java.util.List;

public interface GoalService {
    GoalDTO postGoal(GoalDTO dto);
    List<GoalDTO> getGoals();
    GoalDTO updateStatus(Long id);
}
