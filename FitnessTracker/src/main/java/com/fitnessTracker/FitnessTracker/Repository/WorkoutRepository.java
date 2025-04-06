package com.fitnessTracker.FitnessTracker.Repository;

import com.fitnessTracker.FitnessTracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
