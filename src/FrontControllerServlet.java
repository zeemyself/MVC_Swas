

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet("/FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		System.out.println(url);
		if(url.equals("/MVC_Swas/")){
			Controller ctrl = new HomeController();
			ctrl.execute(request, response);
			return;	
		}
		else if(url.equals("/MVC_Swas/login")){
			Controller ctrl = new LoginController();
			ctrl.execute(request, response);
			return;
		}
		else if(url.equals("/MVC_Swas/welcome")){
			Controller ctrl = new WelcomeController();
			ctrl.execute(request, response);
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		if( url.equals("/MVC_Swas/login")){
			Controller ctrl = new AuthenController();
			ctrl.execute(request, response);
			return;
		}
	}

}
