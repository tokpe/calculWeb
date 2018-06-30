package sn.objis.calculweb.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.service.calcul.CalculMetier;

/**
 * Servlet implementation class CalculServlet
 */
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Instanciation de Service
		CalculMetier calculMetier=new CalculMetier();
		
		//Variable resulat 
		double resulat=0;
		//Vérification de l'action de l'utilisateur 
		String action=request.getParameter("action");
		
		if (action!=null) {

			//Récuperation des valeurs de a et b
			double a= Double.parseDouble(request.getParameter("a"));
			double b= Double.parseDouble(request.getParameter("b"));
			
			if (action.equalsIgnoreCase("somme")) {
				resulat=calculMetier.somme(a, b);
			}else {
				resulat=calculMetier.produit(a, b);
			}
			System.out.println(resulat);
			//Mise à disposition du résultat dans une scope pour la mise à disposition de la JSP
			request.setAttribute("rs",resulat);
			//Redirection
			//request.getRequestDispatcher(request.getContextPath()+"jsp/calcul.jsp").forward(request, response);
			request.getRequestDispatcher("jsp/calcul.jsp").forward(request, response);
			
		}
	
		
		//V
	}

}
