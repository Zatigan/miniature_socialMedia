package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.simplon.models.Post;
import org.simplon.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.simplon.service.PostService;

@WebServlet(name = "feedController", urlPatterns = "/feed")
public class FeedController extends HttpServlet {

    public void init() {
        User ael = new User("Ael", "123456", "vg.gu@gmx.com", new ArrayList<>(), new ArrayList<>());

        PostService.addPost(new Post("blabla", new Date(), ael, 0, new ArrayList<>()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if ((User) session.getAttribute("user") != null) {
            req.setAttribute("postList", PostService.getPosts());
            req.getRequestDispatcher("/feed.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if (req.getParameter("createPostButton") != null) {
            Date newDate = new Date();
            User user = (User) req.getSession().getAttribute("user");
            String newDescription = req.getParameter("descriptionPostInput");
            PostService.addPost(new Post(newDescription, newDate, user, 0, new ArrayList<>()));
            resp.sendRedirect("/feed");
        }

        if (req.getParameter("disconnect") != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", null);
            resp.sendRedirect("/");
        }

    }

}
