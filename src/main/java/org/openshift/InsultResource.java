package org.openshift;

import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by gordelat on 18.01.2018.
 */
@RequestScoped
@Path("/insults")
public class InsultResource {

	@GET()
	@Produces("application/json")
	public HashMap<String, String> getInsult() {
		HashMap<String, String> theInsult = new HashMap<String, String>();
		theInsult.put("insult", new InsultGenerator().generateInsult());
		return theInsult;
	}
}
