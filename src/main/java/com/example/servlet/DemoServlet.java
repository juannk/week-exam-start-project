package com.example.servlet;

import java.io.IOException;
import java.util.List;

import com.example.service.ExpeditionService;
import com.example.model.Expeditions;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "demoServlet", value = "/context-demo")
public class DemoServlet extends HttpServlet {

    private ExpeditionService expeditionsService;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        List<Expeditions> expeditions = expeditionsService.getAllExpeditions();

        response.getWriter().println("<html>");
        response.getWriter().println("<body>");

        response.getWriter().println("<h1>Lista de Expediciones</h1>");

        for (Expeditions expedition : expeditions) {

            response.getWriter().println(
                    "<p>" +
                            expedition.getId() + " - " +
                            expedition.getName() + " - " +
                            expedition.getRegion() + " - " +
                            expedition.getBaseCamp() + " - " +
                            expedition.getLeader() + " - " +
                            expedition.getStartDate() + " - " +
                            expedition.getEndDate() + " - " +
                            expedition.getEstate() + " - " +
                            "</p>"
            );
        }

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }


    @Override
    public void init() throws ServletException {
        super.init();
    }

}
