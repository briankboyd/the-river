package us.kcadventuro.theriver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("players")
public class TheRiverService {

	@GET
	@Path("/hello")
	public String hello() {
		return "Heloo";
	}
}
