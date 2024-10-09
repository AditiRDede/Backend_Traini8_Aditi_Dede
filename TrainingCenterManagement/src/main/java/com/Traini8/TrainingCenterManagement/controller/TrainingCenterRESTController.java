package com.Traini8.TrainingCenterManagement.controller;

import com.Traini8.TrainingCenterManagement.model.TrainingCenter;
import com.Traini8.TrainingCenterManagement.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TrainingCenterRESTController
{
    @Autowired
    private  TrainingCenterService trainingCenterService;
    
    @RequestMapping("/")
    public String homePage()
    {
        return "Welcome to the Training Center Management API!";

    }
    @PostMapping("/trainingcenterpost")
    @ResponseBody
    public ResponseEntity<Void> trainingCenterPost(@Valid @RequestBody TrainingCenter trainingCenter)
    {

        trainingCenterService.addTrainingCenter(trainingCenter);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/trainingcenters")
    @ResponseBody
    public List<TrainingCenter> allTrainingCentersget()
    {
        return trainingCenterService.getAllTrainingCenters();

    }

    @GetMapping("/centercode")
    @ResponseBody
    public Optional<TrainingCenter> trainingCenteByCenterCode(@RequestParam String centercode)
    {

        return trainingCenterService.getTrainingCenterByCode(centercode);

    }
}
