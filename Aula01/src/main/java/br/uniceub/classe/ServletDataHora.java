package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Esta classe mostra a data e hora
 */
@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
	
	@Override
	public void init() throws ServletException {
		log("A servlet iniciou em: "+formataData.format(new Date()));
		super.init();
	}
	
	  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter saida = resp.getWriter();
		saida.write("<HTML><BODY>Olá</BODY></HTML>");
		saida.write("A data e hora atual é:<br>"+formataData.format(new Date()));
		saida.write("</BODY><;HTML>");
		saida.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
}


