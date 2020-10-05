/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunkes.sga.web;

import com.lunkes.sga.domain.Usuario;
import com.lunkes.sga.services.UsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ismael
 */
@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {
    
    @Inject
    UsuarioService usuarioService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> usuarios = usuarioService.findAll();
        System.out.println("Usuarios"+ usuarios);
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("/listarusuarios.jsp").forward(request, response);
        
    }
}
