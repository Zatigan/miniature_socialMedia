package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import org.simplon.models.Commentary;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.simplon.models.Post;
import org.simplon.service.PostService;

@WebServlet("/post/*")
public class PostController extends HttpServlet {

    List<Commentary> commantaries = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getPathInfo().substring(1));
        Post post =  PostService.getById(req.getPathInfo().substring(1));
        System.out.println(post);
        req.setAttribute("post",post);
        req.getRequestDispatcher("/post.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
 
}
