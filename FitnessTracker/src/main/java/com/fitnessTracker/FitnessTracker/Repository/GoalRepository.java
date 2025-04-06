package com.fitnessTracker.FitnessTracker.Repository;

import com.fitnessTracker.FitnessTracker.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
}
