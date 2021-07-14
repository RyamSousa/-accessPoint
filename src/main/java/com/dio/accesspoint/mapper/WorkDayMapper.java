package com.dio.accesspoint.mapper;

import com.dio.accesspoint.model.dto.WorkDayDTO;
import com.dio.accesspoint.model.entity.WorkDay;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Builder
@Component
public class WorkDayMapper {

    public WorkDay toWorkDay(WorkDayDTO dto){
        return WorkDay.builder()
                .id(dto.getId())
                .description(dto.getDescription())
                .build();
    }

    public WorkDayDTO toWorkDayDTO(WorkDay workDay){
        return WorkDayDTO.builder()
                .id(workDay.getId())
                .description(workDay.getDescription())
                .build();
    }
}
