package com.example.servlet;

import java.io.IOException;
import java.util.List;
import com.example.service.ExpeditionsService;
import com.example.model.Expeditions;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "demoServlet", value = "/context-demo")
public class DemoServlet extends HttpServlet {
    private ExpeditionsService expeditionsService;


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }





    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Indicamos que responderemos HTML.
        response.setContentType("text/html");

        // Obtenemos todos los artistas mediante el Service.
        List<Expeditions> expeditions = expeditionsService.getAlExpeditions();

        // Empezamos a construir la respuesta HTML.
        response.getWriter().println("<html>");
        response.getWriter().println("<body>");

        response.getWriter().println("<h1>Lista de Expediciones</h1>");

        // Recorremos todos los artistas.
        for (Expeditions expeditions : expeditions) {

            response.getWriter().println(
                    "<p>" +
                            expeditions.getId() + " - " +
                            expeditions.getName() + " - " +
                            expeditions.getRegion() + " - " +
                            expeditions.getBaseCamp() + " - " +
                            expeditions.getLeader() + " - " +
                            expeditions.getStartDate() + " - " +
                            expeditions.getEndDate() + " - " +
                            expeditions.getEstate() + " - " +
                            "</p>"
            );
        }

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}

}
