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
import org.simplon.service.PostService;

@WebServlet(name="feedController", urlPatterns ="/feed")
public class FeedController extends HttpServlet{


    public void init(){
        User ael = new User("Ael","123456","vg.gu@gmx.com" , new ArrayList<>(), new ArrayList<>());

        PostService.addPost(new Post("blabla",new Date(),ael,0,new ArrayList<>()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("postList",PostService.getPosts());
        req.getRequestDispatcher("/feed.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        //Créer une condition qui vérifie l'existence d'une session ?
        //Créer un try catch qui try la session, et qui catch quand pas de session ?

            if(req.getParameter("createPostButton") != null){
                System.out.print("ici");
                Date newDate = new Date();
                User ael = new User("Ael","123456","vg.gu@gmx.com" , new ArrayList<>(), new ArrayList<>());
                String newDescription = req.getParameter("descriptionPostInput");
                PostService.addPost(new Post(newDescription,newDate,ael,0,new ArrayList<>()));
                resp.sendRedirect("/feed");
            }
    }

    
 
}
