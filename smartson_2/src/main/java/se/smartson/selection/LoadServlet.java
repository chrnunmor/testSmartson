package se.smartson.selection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.googlecode.objectify.ObjectifyService;
import se.smartson.selection.Campaign;
import se.smartson.selection.Person;

public class LoadServlet extends HttpServlet {
 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String c = (String) req.getAttribute("campaign");
		
		Campaign campaign = ObjectifyService.ofy()
				.load()
				.type(Campaign.class)
				//.filter("id ==", c)
				.first()
				.now();
		
		
		List<Person> persons = ObjectifyService.ofy()
				.load()
				.type(Person.class)
				//.filter(c + " in", "campaigns")
				.list();
		
		ServletContext sc = getServletContext();
	    RequestDispatcher rd = sc.getRequestDispatcher("/selection.jsp");

	    req.setAttribute("campaign", campaign);
	    req.setAttribute("persons", persons);
	    rd.forward(req, resp);
  }
}
//[END all]

