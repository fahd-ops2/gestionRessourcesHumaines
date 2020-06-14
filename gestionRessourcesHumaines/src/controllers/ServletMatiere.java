package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MatiereDao;
import classes.Matiere;

/**
 * Servlet implementation class ServletMatiere
 */
@WebServlet("/ServletMatiere")
public class ServletMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionID = request.getParameter("actionID");
		if(actionID.equals("ajout")){
			int PersonnelID= Integer.parseInt(request.getParameter("PersonnelID"));
			String NomMatiere= request.getParameter("NomMatiere");
			Matiere mat = new Matiere(PersonnelID,NomMatiere);
			System.out.println(mat.toString());
			try {
				MatiereDao matdao= new MatiereDao();
				matdao.insertMatiere(mat);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/ShowMatieres.jsp").forward(request, response);
	}
	}
}
