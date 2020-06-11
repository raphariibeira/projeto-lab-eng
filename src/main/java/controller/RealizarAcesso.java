package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;


@WebServlet(name="RealizarAcesso", urlPatterns= {"/index"})
public class RealizarAcesso extends HttpServlet{
	@Override
	public void doPost(	HttpServletRequest req,
						HttpServletResponse res){
		req.getRequestDispatcher("index.html");
	}
}