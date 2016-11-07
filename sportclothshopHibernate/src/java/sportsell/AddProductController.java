/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsell;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.hibernate.criterion.Restrictions.ge;

/**
 *
 * @author NUT
 */
public class AddProductController extends HttpServlet {

   

// …. Omit remain code
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("add new product");
            HttpSession session = request.getSession(true);

            String pteam = request.getParameter("PTeam");
            String psize = request.getParameter("PSize");
            String pcolor = request.getParameter("PColor");
            float pprice = Float.valueOf(request.getParameter("PPrice"));
            int pamount = Integer.valueOf(request.getParameter("PAmount"));

            Product ac = new Product(pteam, psize, pcolor, pprice, pamount);
            

            ProductService1 acs = new ProductService1();
            String resultMessage = acs.addProduct(ac);

            RequestDispatcher rd = request.getRequestDispatcher("product.jsp?message=" + resultMessage);
            request.setAttribute("searchResult", null);
            rd.forward(request, response);
        
    
        }catch(Exception e){
            
            
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
