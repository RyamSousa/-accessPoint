package com.dio.accesspoint.controller;

import com.dio.accesspoint.model.entity.WorkDay;
import com.dio.accesspoint.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workday")
public class WorkDayController {

    @Autowired
    private WorkDayService workDayService;

    @PostMapping
    public ResponseEntity<WorkDay> createWorkDay(@RequestBody WorkDay workDay){
        return ResponseEntity.ok(workDayService.save(workDay));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkDay> findByIdWorkDay(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(workDayService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<WorkDay>> findAllWorkDays(){
        return ResponseEntity.ok(workDayService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WorkDay> deleteWorkDay(@PathVariable("id") Long id){
        workDayService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<WorkDay> updateWorkDay(@RequestBody WorkDay workDay){
        return ResponseEntity.ok(workDayService.update(workDay));
    }
}
