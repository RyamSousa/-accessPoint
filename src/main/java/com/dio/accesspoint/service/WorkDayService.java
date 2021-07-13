package com.dio.accesspoint.service;

import com.dio.accesspoint.model.entity.WorkDay;
import com.dio.accesspoint.repository.WorkDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WorkDayService {

    @Autowired
    private WorkDayRepository workDayRepository;

    @Transactional
    public WorkDay save(WorkDay workDay) {
        return workDayRepository.save(workDay);
    }

    @Transactional
    public WorkDay findById(Long id) throws Exception {
        return workDayRepository.findById(id).orElseThrow(() -> new Exception("Work day not found"));
    }

    @Transactional
    public void delete(Long id){
        workDayRepository.deleteById(id);
    }

    @Transactional
    public List<WorkDay> findAll(){
        return workDayRepository.findAll();
    }

    @Transactional
    public WorkDay update(WorkDay workDay) {
        return workDayRepository.save(workDay);
    }
}
