package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class RealizarAcesso extends HttpServlet{
    
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
		} catch (Exception e) {
			System.out.println("Erro em IO ou no Servlet");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String usuario = req.getParameter("usuario");
			String senha = req.getParameter("senha");

			if( usuario != null && senha != null) {
				System.out.println(usuario);
				req.getRequestDispatcher("/WEB-INF/calcular.jsp").forward(req, resp);
				resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("Login realizado");

			} else {
				req.setAttribute("message", "Erro, favor verifique nome de usuario e senha e tente novamente");
				req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
			}

		} catch (Exception e) {
			System.out.println("Erro em IO ou no Servlet");
		}
	}
}