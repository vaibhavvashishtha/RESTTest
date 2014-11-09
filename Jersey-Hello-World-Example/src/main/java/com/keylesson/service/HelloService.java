package com.keylesson.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/{param}")
	public Response sayHello(@PathParam("param") String name) {
		String output = "Hello " + name;
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/sessionTest")
	@Produces("text/plain")
	public String hello(@Context HttpServletRequest req) {

		HttpSession session = req.getSession(true);
		Object foo = session.getAttribute("foo");
		if (foo != null) {
			System.out.println(foo.toString());
		} else {
			foo = "bar";
			session.setAttribute("foo", "bar");
		}
		return foo.toString();

	}

	@GET
	@Path("/index")
	@Produces("text/html")
	public Viewable index() {
		//request.setAttribute("obj", new String("IT Works"));
		System.out.println("/INDEX called");
		/*	HttpSession session = request.getSession(true);
		Object foo = session.getAttribute("foo");
		if (foo != null) {
			System.out.println(foo.toString());
		} else {
			foo = "bar";
			session.setAttribute("foo", "bar");
		}*/
		return new Viewable("index");
	}

}
