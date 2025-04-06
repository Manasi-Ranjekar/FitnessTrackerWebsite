package com.fitnessTracker.FitnessTracker.Services.Activity;

import com.fitnessTracker.FitnessTracker.DTO.ActivityDTO;
import com.fitnessTracker.FitnessTracker.Repository.ActivityRepository;
import com.fitnessTracker.FitnessTracker.entity.Activity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityServiceImpl implements ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityDTO postActivity(ActivityDTO dto){
        Activity activity = new Activity();
        activity.setSteps(dto.getSteps());
        activity.setDate(dto.getDate());
        activity.setDistance(dto.getDistance());
        activity.setCaloriesBurned(dto.getCaloriesBurned());
        return activityRepository.save(activity).getActivityDTO();


    }
    public List<ActivityDTO> getActivities(){
        List<Activity> activities = activityRepository.findAll();
        return activities.stream().map(Activity::getActivityDTO).collect(Collectors.toUnmodifiableList());

    }
}
