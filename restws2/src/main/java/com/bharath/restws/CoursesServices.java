package com.bharath.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.bharath.restws.model.Course;


@Consumes("application/xml,application/json") //consumes only these types of files
@Produces("application/xml,application/json") //produces only these types of files as a result		
@Path("/courses")
public interface CoursesServices {

	@Path("/coursedetails")
	@GET
	List<Course> getCourse();
	
	@Path("/coursedetails/{id}")
	@GET
	Course getCourse(@PathParam(value = "id") Long id); 
	
	@Path("/coursedetails")
	@POST
	Response createCourse(Course course);
	
	

	@Path("/patients")
	@PUT
	Response updatePatient(Course course);
	
}
