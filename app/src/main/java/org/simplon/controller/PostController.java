package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import org.simplon.models.Commentary;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.simplon.models.Post;
import org.simplon.models.User;
import org.simplon.service.PostService;

@WebServlet("/post/*")
public class PostController extends HttpServlet {

    List<Commentary> commantaries = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null) {
            Post post = PostService.getById(req.getPathInfo().substring(1));
            req.setAttribute("post", post);
            req.getRequestDispatcher("/post.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("createCommentaryButton") != null) {
            Post post = PostService.getById(req.getPathInfo().substring(1));
            Date newDate = new Date();
            User user = (User) req.getSession().getAttribute("user");
            String newDescription = req.getParameter("commentaryPostInput");
            post.setCommentaires(new Commentary(newDescription, newDate, user));
            resp.sendRedirect("/post/" + req.getPathInfo().substring(1));
        }

        if (req.getParameter("backArrow") != null) {
            resp.sendRedirect("/feed");
        }

        if (req.getParameter("disconnect") != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", null);
            resp.sendRedirect("/");
        }
    }

}
