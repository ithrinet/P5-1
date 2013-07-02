/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Desktop
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println(
                    // <editor-fold defaultstate="collapsed" desc="Codgio HTML Del Servlet">
                "<!DOCTYPE html>"
                +"<html>"
                    +"<head>"
                        +"<title>Innformación Con Servlet</title>"
                        +"<link href=\"css/cssLayout.css\" rel=\"stylesheet\" type=\"text/css\" />"
                        +"<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />"
                        +"<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />"
                    +"</head>"
                    +"<body >"
                        +"<div id=\"top\" class=\"top\">\n" 
                            +"<div class=\"container\" >\n" 
                                +" <div class=\"row-fluid\">\n"
                                    +"<div class=\"span12\">\n" 
                                        +"<h1>Practica 5-1 JEE</h1>\n" 
                                    +"</div>\n" 
                                +"</div>\n" 
                            +"</div>\n" 
                        +"</div>"
                        +"<div id=\"container\" class=\"center_content\">\n" 
                            +"<div class=\"container\">\n"
                                +"<div class=\"row-fluid\">\n"
                                    +"<div class=\"span12 inner\">\n"
                                        +"<div class=\"row-fluid\">\n" 
                                            +"<div class=\"span12\">\n"
                                                +"<div class=\"box\">\n"
                                                    +"<header>\n" 
                                                        +"<div class=\"icons\"><i class=\"icon-edit\"></i></div>\n"
                                                        +"<h5>Informacion con Pagina Servlet</h5>\n"
                                                    +"</header>\n"
                                                    +"<div id=\"div-1\" class=\"accordion-body collapse in body\">"
                                                        +"<table class=\"table\">"
                                                            +"<tbody>"
                                                                +"<tr>"
                                                                    +"<th>Metodo: </th>"
                                                                    +"<td>" + request.getMethod() + "</td>"
                                                                +"</tr>"
                                                                +"<tr>"
                                                                    +"<th>Protocolo: </th>"
                                                                    +"<td>" + request.getProtocol() + "</td>"
                                                                +"</tr>"
                                                                +"<tr>"
                                                                    +"<th>IP Cliente: </th>"
                                                                    +"<td>" + request.getRemoteAddr() + "</td>"
                                                                +"</tr>"                    
                                                                +"<tr>"
                                                                    +"<th>Host Cliente: </th>"
                                                                    +"<td>" + request.getRemoteHost() + "</td>"
                                                                +"</tr>"
                                                                +"<tr>"
                                                                    +"<th>URL: </th>"
                                                                    +"<td>" + request.getRequestURL()+ "</td>"
                                                                +"</tr>"
                                                                +"<tr>"
                                                                    +"<th>Nombre Path: </th>"
                                                                    +"<td>" + request.getServletPath() + "</td>"
                                                                +"</tr>"
                                                                +"<tr>"
                                                                    +"<th>Query String: </th>"
                                                                    +"<td>" + request.getQueryString() + "</td>"
                                                                +"</tr>"
                                                                +"<tr>"
                                                                    +"<th>User Agent: </th>"
                                                                    +"<td>" + request.getHeader("User-Agent") + "</td>"
                                                                +"</tr>"
                                                            +"</tbody>"
                                                        +"</table>"
                                                +"</div>"
                                            +"</div>"
                                        +"</div>"
                                    +"</div>"
                                +"</div>"
                            +"</div>"
                    +"</body>"
                +"</html>"
                    
                    );// </editor-fold>
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
