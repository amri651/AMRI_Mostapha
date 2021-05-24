package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EtudiantDAO;
import entité.Etudiant;

@WebServlet("/S_inscrire")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Inscription() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username = request.getParameter("username");
	      String password = request.getParameter("password");
	      String nom = request.getParameter("nom");
	      String prenom = request.getParameter("prenom");    
	      Etudiant etu=new Etudiant();
	      etu.setEmail(username);
	      etu.setNom(nom);
	      etu.setPassword(password);
	      etu.setPrenom(prenom);
	      EtudiantDAO.AjouterEtudiant(etu);
	      response.sendRedirect("Authentification");
	     
	}

}
