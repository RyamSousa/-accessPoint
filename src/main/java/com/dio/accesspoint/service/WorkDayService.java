package com.dio.accesspoint.service;

import com.dio.accesspoint.mapper.WorkDayMapper;
import com.dio.accesspoint.model.dto.WorkDayDTO;
import com.dio.accesspoint.model.entity.WorkDay;
import com.dio.accesspoint.repository.WorkDayRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class WorkDayService {


    private WorkDayRepository repositoryWorkDay;

    private WorkDayMapper workDayMapper;

    @Transactional
    public WorkDayDTO save(WorkDayDTO dto) {
        WorkDay workDayEntity = workDayMapper.toWorkDay(dto);
        workDayEntity = repositoryWorkDay.save(workDayEntity);
        WorkDayDTO workDayDTO = workDayMapper.toWorkDayDTO(workDayEntity);

        return workDayDTO;
    }

    @Transactional
    public WorkDayDTO findById(Long id){
        Optional<WorkDay> workDayEntity = repositoryWorkDay.findById(id);
        WorkDayDTO workDayDTO = workDayMapper.toWorkDayDTO(workDayEntity.get());

        return workDayDTO;
    }

    @Transactional
    public void delete(Long id){
        repositoryWorkDay.deleteById(id);
    }

    @Transactional
    public List<WorkDayDTO> findAll(){
        List<WorkDay> allWorkDays = repositoryWorkDay.findAll();

        return allWorkDays
                .stream()
                .map(workDayMapper::toWorkDayDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public WorkDayDTO update(WorkDayDTO dto) {
        WorkDay workDayEntity = workDayMapper.toWorkDay(dto);
        workDayEntity = repositoryWorkDay.save(workDayEntity);
        WorkDayDTO workDayDTO = workDayMapper.toWorkDayDTO(workDayEntity);

        return workDayDTO;
    }
}
