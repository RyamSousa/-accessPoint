package com.dio.accesspoint.controller;

import com.dio.accesspoint.model.dto.WorkDayDTO;
import com.dio.accesspoint.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workday")
public class WorkDayController {

    @Autowired
    private WorkDayService serviceWorkDay;

    @PostMapping
    public ResponseEntity<WorkDayDTO> createWorkDay(@RequestBody WorkDayDTO workDay){
        return ResponseEntity.ok(serviceWorkDay.save(workDay));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkDayDTO> findByIdWorkDay(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(serviceWorkDay.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<WorkDayDTO>> findAllWorkDays(){
        return ResponseEntity.ok(serviceWorkDay.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WorkDayDTO> deleteWorkDay(@PathVariable("id") Long id){
        serviceWorkDay.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<WorkDayDTO> updateWorkDay(@RequestBody WorkDayDTO workDay){
        return ResponseEntity.ok(serviceWorkDay.update(workDay));
    }
}
