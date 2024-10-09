package com.Traini8.TrainingCenterManagement.service;

import com.Traini8.TrainingCenterManagement.model.TrainingCenter;
import com.Traini8.TrainingCenterManagement.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class TrainingCenterService
{
    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public void addTrainingCenter(TrainingCenter trainingCenter)
    {
        trainingCenterRepository.save(trainingCenter);
    }
    public List<TrainingCenter> getAllTrainingCenters()
    {
        return trainingCenterRepository.findAll();
    }

    public Optional<TrainingCenter> getTrainingCenterByCode(String code)
    {

        return trainingCenterRepository.findById(code);
    }

}
