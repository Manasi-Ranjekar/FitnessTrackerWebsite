package com.fitnessTracker.FitnessTracker.Services.Activity;

import com.fitnessTracker.FitnessTracker.DTO.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);
    List<ActivityDTO> getActivities();

}
