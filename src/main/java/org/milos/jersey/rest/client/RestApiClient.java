package org.milos.jersey.rest.client;

import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class RestApiClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		
		Response response = client.target("http://localhost:8080/jax-rs-jersey/webapi/test").request().get();
		System.out.println(response.readEntity(Date.class));
	}

}
