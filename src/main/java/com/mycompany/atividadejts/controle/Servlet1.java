/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadejts.controle;

import com.mycompany.atividadejts.modelo.NewSVG;
import com.mycompany.atividadejts.modelo.PropriedadesGeometry;
import com.mycompany.atividadejts.modelo.ViewBox;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author caio
 */
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws com.vividsolutions.jts.io.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String geometriaA = request.getParameter("geometriaA");
            String geometriaB = request.getParameter("geometriaB");
            WKTReader reader = new WKTReader();
        
            Geometry geometria1;
            Geometry geometria2;
            try {
                geometria1 = reader.read(geometriaA);
                geometria2 = reader.read(geometriaB);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>AtividadeJTS</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<form name=\"form1\" method=\"post\" action=\"Servlet1\">\n" +
"            \n" +
"            <p>Digite a Geometria A: \n" +
"                <input name=\"geometriaA\" type=\"text\" id=\"A\">\n" +
"            </p>\n" +
"            <p>Digite a Geometria B: \n" +
"                <input name=\"geometriaB\" type=\"text\" id=\"B\">\n" +
"            </p>\n" +
"            \n" +
"            <p> <input type=\"submit\" value=\"Enviar\"></p>\n" +
"        </form>");
                ViewBox box = new ViewBox();
                out.println("<svg width=\"auto\" height=\"auto\"viewBox='\"+ box.getViewBox(geometria1, geometria2) +\"'>");
                NewSVG svg = new NewSVG();
                out.println("<path d='"+ svg.getSvg(geometria1)+"' fill=\"black\" stroke=\"black\"/>");
                out.println("<path d='"+ svg.getSvg(geometria2)+"' fill=\"blue\" stroke=\"blue\"/>");
                out.println("</svg><br>");
                out.println("<div style=\" width:100%; \">");
                out.println("<div style=\" width:20%; float: left;\"><h1><b>Binary Predicates</b></h1>"
                    + "<ul style=\"list-style-type: none;\"><li>Equals</li>"
                    + "<li>Disjoint</li>"
                    + "<li>Intersects</li>"
                    + "<li>Touches</li>"
                    + "<li>Crosses</li>"
                    + "<li>Within</li>"
                    + "<li>Contains</li>"
                    + "<li>Overlaps</li>"
                    + "<li>Covers</li>"
                    + "<li>CoveredBY</li>"
                    + "</ul></div>");
                PropriedadesGeometry pg = new PropriedadesGeometry();
                out.println("<div style=\" width:5%; float: left;\"><h1><b>AB</b></h1>"
                    + "<ul style=\"list-style-type: none;\"> <li>"+ pg.equalsAB(geometria1, geometria2) +"</li>"
                    + "<li>"+ pg.disjointAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.intersectsAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.touchesAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.crossesAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.withinAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.containsAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.overlapsAB(geometria1, geometria2)+"<li>"
                    + "<li>"+ pg.coversAB(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.coveredBYAB(geometria1, geometria2)+"</li>"
                    + "</ul></div>");
                out.println("<div style=\" width:5%; float: left;\"><h1><b>BA</b></h1>"
                    + "<ul style=\"list-style-type: none;\"> <li>"+ pg.equalsBA(geometria1, geometria2) +"</li>"
                    + "<li>"+ pg.disjointBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.intersectsBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.touchesBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.crossesBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.withinBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.containsBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.overlapsBA(geometria1, geometria2)+"<li>"
                    + "<li>"+ pg.coversBA(geometria1, geometria2)+"</li>"
                    + "<li>"+ pg.coveredBYBA(geometria1, geometria2)+"</li>"
                    + "</ul></div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            } catch (ParseException ex) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>AtividadeJTS</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<form name=\"form1\" method=\"post\" action=\"Servlet1\">\n" +
"            \n" +
"            <p>Digite a Geometria A: \n" +
"                <input name=\"geometriaA\" type=\"text\" id=\"A\">\n" +
"            </p>\n" +
"            <p>Digite a Geometria B: \n" +
"                <input name=\"geometriaB\" type=\"text\" id=\"B\">\n" +
"            </p>\n" +
"            \n" +
"            <p> <input type=\"submit\" value=\"Enviar\"></p>\n" +
"        </form>");
                out.println("<h1>Erro! valores incorretos</h1>");
                out.println("</body>");
                out.println("</html>");
            }
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
