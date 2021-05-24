package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LivreDao;
import entité.Livre;
 

@WebServlet("/Ajout_livre")
public class Ajout_livre extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ajout_livre() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String titre= request.getParameter("titre");
	   String auteur= request.getParameter("auteur");
	   String description= request.getParameter("description");
	   
	    Livre book=new Livre();
	    book.setTitre(titre);
	    book.setAuteur(auteur);
	    book.setDescription(description);
	    LivreDao.AjouterLivre(book);
	    response.sendRedirect("PageAcceuil.jsp");
	}

}
