package com.github;

import javax.ws.rs.Path;

@Path("/w")
public class Sample {

	@Path("/time")
	public String time() {
		return "Hi";
	}

}