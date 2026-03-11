package org.simplon.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.catalina.Session;
import org.simplon.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
  if (req.getParameter("loginButton") != null) {

   String usernameLogin = req.getParameter("usernameLogin");
   String passwordLogin = req.getParameter("passwordLogin");

   for (User user : users) {

    if (user.getPseudo().equals(usernameLogin)) {

     if (user.getPassword().equals(passwordLogin)) {
      HttpSession session = req.getSession();
      session.setAttribute("user", user.getId());
      resp.sendRedirect("/feed");
      break;
     }

     resp.sendError(400, "Pseudo or password are invalid.");

    }

    resp.sendError(400, "Pseudo or password are invalid.");
   }

  }

 }

}
