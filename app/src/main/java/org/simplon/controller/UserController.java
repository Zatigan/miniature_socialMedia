package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.simplon.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet{
 
protected static List<User> users = new ArrayList<>();

 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  req.setAttribute("userList", users);
 }

}
