// Import required java libraries
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

// Extend HttpServlet class
@WebServlet("/CheckMember")
public class MemberCheck extends HttpServlet {
   public void init() throws ServletException {
      // do nothing
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	
	  response.setContentType("text/plain");
	  
	  response.getWriter().println("!RC=0 ");
	  response.getWriter().println("!TICKET=0");
	  response.getWriter().println("VER=DS00001");
	  response.getWriter().println("UNREADMAIL=0");
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request, response);
   }

   public void destroy() {
      // do nothing.
   }
}