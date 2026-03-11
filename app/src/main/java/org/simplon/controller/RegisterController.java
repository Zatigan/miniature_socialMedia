package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.simplon.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class RegisterController extends UserController {

 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  super.doGet(req, resp);
  req.getRequestDispatcher("/register.jsp").forward(req, resp);
 }

 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

  if (req.getParameter("registerForm") != null) {
   String pseudo = req.getParameter("pseudo");
   String email = req.getParameter("email");
   String password = req.getParameter("password");
   String confirmedPassword = req.getParameter("confirmedPassword");
   String validPassword;

   if (password.equals(confirmedPassword) && !pseudo.isBlank()) {
    validPassword = password;
    users.add(new User(pseudo, validPassword, email, new ArrayList<>(), new ArrayList<>()));
    resp.sendRedirect("/login");
   } else {
    resp.sendError(400, "Password and confirmedPassword do not match.");
   }
   ;

  }

 }

}
