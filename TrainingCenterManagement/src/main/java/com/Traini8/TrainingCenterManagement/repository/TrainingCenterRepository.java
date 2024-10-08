package com.Traini8.TrainingCenterManagement.repository;

import com.Traini8.TrainingCenterManagement.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,String>
{


}
