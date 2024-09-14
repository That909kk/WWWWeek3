package vn.com.teo.fit.api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import vn.com.teo.fit.business.BaseProcess;
import vn.com.teo.fit.models.Student;

import java.util.List;

@Path("/students")
public class StudentResource {
    @Inject
    private BaseProcess process;

    @GET
    @Produces("application/json")
    public List<Student> getAll(){
        return process.getAll();
    }

    @GET
    @Path("/{id}")
    public Response getByID(@PathParam("id") long id){
        Response.ResponseBuilder builder = Response.ok();
        builder.entity(process.getById(id));
        return builder.build();
    }
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response add(Student student){
        Response.ResponseBuilder builder = Response.ok();
        builder.entity(process.persist(student));
        return builder.build();
    }
}
