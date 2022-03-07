package dev.fullstackcode.quarkus.crud.example.controller;



import dev.fullstackcode.quarkus.crud.example.dto.DepartmentDto;
import dev.fullstackcode.quarkus.crud.example.service.DepartmentService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/department")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DepartmentResource {

    @Inject
    DepartmentService departmentService;


    @GET
    @Path("/{id}")
    public DepartmentDto getDepartment(@PathParam(value = "id") Long id) {
        return departmentService.getDepartment(id);
    }

    @GET
    public List<DepartmentDto> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @POST
    public DepartmentDto createEmployee(DepartmentDto department) {
        return departmentService.createDepartment(department);
    }

}