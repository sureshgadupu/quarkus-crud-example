package dev.fullstackcode.quarkus.crud.example.mapper;


import dev.fullstackcode.quarkus.crud.example.dto.DepartmentDto;
import dev.fullstackcode.quarkus.crud.example.entity.Department;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface DepartmentMapper {
    DepartmentDto toDepartmentDto(Department department);
    List<DepartmentDto> toDepartmentDtoList(List<Department> departments);
    Department toDepartmentEntity(DepartmentDto departmentDto);
}

