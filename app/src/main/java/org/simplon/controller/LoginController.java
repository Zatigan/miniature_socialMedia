package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.simplon.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class LoginController extends UserController {
 
 public void init() {
  users.add(new User("Zatigan", "123456", "pie.boulet@gmx.com", new ArrayList<>(), new ArrayList<>()));
 }

 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  super.doGet(req, resp);
  req.getRequestDispatcher("/login.jsp").forward(req, resp);
 }

 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  super.doPost(req, resp);
  req.getSession(true);
 }

}
