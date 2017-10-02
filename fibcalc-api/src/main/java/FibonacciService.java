import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fibcalc")
public interface FibonacciService {
	
	@GET
	@Path("/fib/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	public Result fibonacci (@PathParam("num") int num);

}
