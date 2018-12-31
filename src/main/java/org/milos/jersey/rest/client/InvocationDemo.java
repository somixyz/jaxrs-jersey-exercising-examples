package org.milos.jersey.rest.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericType;

public class InvocationDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		new GenericType< List<Integer>>() {};
	}
}
