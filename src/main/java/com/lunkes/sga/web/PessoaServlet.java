/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunkes.sga.web;

import com.lunkes.sga.domain.Pessoa;
import com.lunkes.sga.services.PessoaService;
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
@WebServlet("/pessoas")
public class PessoaServlet extends HttpServlet{
    
    @Inject
    PessoaService pessoaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        List<Pessoa> pessoas = pessoaService.findAll();
        System.out.println("Pessoas"+ pessoas);
        request.setAttribute("pessoas", pessoas);
        request.getRequestDispatcher("/listarpessoas.jsp").forward(request, response);
       
    }
    
    
}
