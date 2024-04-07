// Import required java libraries
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

// Extend HttpServlet class
@WebServlet("/GetCommunicationConfig")
public class ConnectionSettings extends HttpServlet {
	private static final Logger logger = Logger.getLogger("HelloWorld");

   public void init() throws ServletException {
      // do nothing
   }
   
   /*
    * Here are some examples you can use.
    * 
    * response.getWriter().println("!RC=0 ");
	  response.getWriter().println("NETWORKID=K6R4A0N0D6N4E0T0");
	  response.getWriter().println("NETWORKPW=K1QU0K@N");
    * response.getWriter().println("VERSION=0");
    * response.getWriter().println("AP=test,test2");
	  response.getWriter().println("APTEL=0335685050,0335685050");
    * 
    * 
    */
   
   /*
    * response.getWriter().println("!RC=0 ");
	  response.getWriter().println("NETWORKID=K6R4A0N0D6N4E0T0");
	  response.getWriter().println("NETWORKPW=K1QU0K@N");
	  response.getWriter().println("MYAPPCODE=52");
	  response.getWriter().println("VERSION=0004");
	  response.getWriter().println("MULTCASTADDR=hello");
	  response.getWriter().println("MULTCASTPORT=there");
	  response.getWriter().println("PROXY=mcgee");
	  response.getWriter().println("NOPROXY=yolo");
	  response.getWriter().println("AP=test,test2");
	  response.getWriter().println("APTEL=0335685050,0335685050");
    * 
    * 
    * 
    * 
    * 
    * 
    * 
    */

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	  final String memberId = request.getParameter("MEMBERID");
	  final String memberPassword = request.getParameter("MEMBERPW");
	  
	  logger.info(memberId);
	  logger.info(memberPassword);
	  
	  response.setContentType("text/plain");
	  
	  response.getWriter().println("!RC=0 ");
	  response.getWriter().println("NETWORKID=K6R4A0N0D6N4E0T0");
	  response.getWriter().println("NETWORKPW=K1QU0K@N");
	  response.getWriter().println("MYAPPCODE=00010");
	  response.getWriter().println("VERSION=0");
	  response.getWriter().println("MULTCASTADDR=225.6.7.8"); //This is what my disk had for this value
	  response.getWriter().println("MULTCASTPORT=9999"); //This is what my disk had for this value
	  //response.getWriter().println("PROXY=172.16.10.40:8080"); //Proxy has an issue and doesn't seem to work
	  //response.getWriter().println("NOPROXY=randnet.ne.jp 80"); //Value should be randnet.ne.jp 80 but DD trims the space so this won't work
	  response.getWriter().println("AP=00001,00010,00011,00012"); //Seems to be an issue with commas but this will do for no
	  response.getWriter().println("APTEL=00772090064,0335685050,0335685054,0112005093");
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request, response);
   }

   public void destroy() {
      // do nothing.
   }
}