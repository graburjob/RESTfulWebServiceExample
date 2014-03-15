package org.arpit.javapostsforlearning.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("PatientProfileService")
public class PatientProfileService {
	
	 @GET
     @Path("/getPatientProfile")
     @Produces(MediaType.APPLICATION_JSON)
	public  String getPatientProfile(){
		 User user = new User();
		 Gson gson = new Gson();
		 user.setUser("jagan");
		return gson.toJson(user);
	}
}
