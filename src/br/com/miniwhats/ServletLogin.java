package br.com.miniwhats;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.SynchronizationType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.sun.org.apache.xml.internal.security.keys.storage.implementations.SingleCertificateResolver;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {

	private static final long serialVersionUID = -7935471153324229948L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String usr = request.getParameter("usr");
		String pwd = request.getParameter("pwd");

		if(autenticar(usr, pwd)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(usr, pwd);
			request.getRequestDispatcher("index.jsp").forward(request, response);	
		}else {
			out.println("Acesso negado.");
		}
		
	}

	private boolean autenticar(String u, String s) {

		String usuarioPadrao = "gabriel";
		String senhaPadrao = "123";

		if ((u.equals(usuarioPadrao) && (s.equals(senhaPadrao)))) {
			return true;
		}
		return false;
	}

}
