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

@WebServlet(name="feedController", urlPatterns ="/feed")
public class FeedController extends HttpServlet{

    List<Post> posts = new ArrayList<Post>();

    public void init(){
        posts.add(new Post(0,"blabla",new Date(),new User("Ael","123456","vg.gu@gmx.com" , new ArrayList<>(), new ArrayList<>()),0,new ArrayList<>()));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("postList",posts);
        req.getRequestDispatcher("/feed.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
    }

    
 
}
