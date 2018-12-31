package org.milos.jersey.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class DateResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date getRequestedDate() {
		return Calendar.getInstance().getTime();
	}
}
