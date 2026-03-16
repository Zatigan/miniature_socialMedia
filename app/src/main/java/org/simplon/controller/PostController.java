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
import org.simplon.models.Post;
import org.simplon.models.User;
import org.simplon.service.PostService;

@WebServlet("/post/*")
public class PostController extends HttpServlet {

    List<Commentary> commantaries = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Post post =  PostService.getById(req.getPathInfo().substring(1));
        req.setAttribute("post",post);
        req.getRequestDispatcher("/post.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if(req.getParameter("createCommentaryButton") != null){
            Post post =  PostService.getById(req.getPathInfo().substring(1));
            Date newDate = new Date();
            User ael = new User("Ael","123456","vg.gu@gmx.com" , new ArrayList<>(), new ArrayList<>());
            String newDescription = req.getParameter("commentaryPostInput");
            post.setCommentaires(new Commentary(newDescription,newDate,ael));
            resp.sendRedirect("/post/"+req.getPathInfo().substring(1));
        }
    }
 
}
