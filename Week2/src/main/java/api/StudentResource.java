package api;

import business.BaseProcess;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import models.Student;

import java.util.List;

@Path("/students")
public class StudentResource {
    @Inject BaseProcess baseProcess;
    @GET
    public Response getStudents() {
        BaseProcess baseProcess = new BaseProcess();
        List<Student> students = baseProcess.getStudents();
        return Response.ok(students).build();
    }
}
