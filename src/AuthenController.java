import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		
		
		if(UserId.validate(user,pass)){
		session.setAttribute("username", user);
		response.sendRedirect("/MVC_Swas/welcome");
		}
		else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/fail.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
