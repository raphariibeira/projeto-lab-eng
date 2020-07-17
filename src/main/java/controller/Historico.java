package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/historico")
public class Historico extends HttpServlet{
    
	
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{
			req.getRequestDispatcher("/WEB-INF/historico.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}
}