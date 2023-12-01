package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.repository.MysqlOradorRepository;
import ar.com.codoacodo.repository.OradorRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//http://localhost:8080/web-app-23544/api/orador/nuevo
@WebServlet("/api/orador/nuevo")
public class NuevoOradorController extends HttpServlet{

	//crear > POST
	protected void doPost(
				HttpServletRequest request, 
				HttpServletResponse response
			) throws ServletException, IOException {
		
		response.addHeader("Access-Control-Allow-Origin","*");
		
		String orador = request.getParameter("orador");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String tema = request.getParameter("tema");
		
		
		Orador nuevo = new Orador(nombre, apellido, email, tema, LocalDate.now());
		
		
		OradorRepository repository = new MysqlOradorRepository();
		
		repository.save(nuevo);
		
	}


	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin","*");
	    response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, HEAD");
	    response.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
	}
}