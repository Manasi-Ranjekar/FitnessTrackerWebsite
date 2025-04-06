package com.fitnessTracker.FitnessTracker.Repository;

import com.fitnessTracker.FitnessTracker.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
