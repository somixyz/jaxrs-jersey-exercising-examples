package org.milos.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test") 
public class MyResource {
	
	@PathParam("pathParam") private String pathParamExa;
	@QueryParam("query") private String queryParam;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "it works , pathParam is"+pathParamExa+" ,queryParam "+queryParam;
	}
}
