/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lunkes.sga.services;

import com.lunkes.sga.dados.PessoaDao;
import com.lunkes.sga.domain.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ismael
 */
@Stateless
public class PessoaServiceImpl implements PessoaServiceRemote, PessoaService{

    @Inject
    private PessoaDao pessoaDao;
    
    @Override
    public List<Pessoa> findAll() {
        return pessoaDao.findAll();
    }

    @Override
    public Pessoa findById(Pessoa pessoa) {
        return pessoaDao.findById(pessoa);
    }

    @Override
    public Pessoa findByEmail(Pessoa pessoa) {
        return pessoaDao.findByEmail(pessoa);
    }

    @Override
    public void save(Pessoa pessoa) {
        pessoaDao.save(pessoa);
    }

    @Override
    public void update(Pessoa pessoa) {
        pessoaDao.update(pessoa);
    }

    @Override
    public void delete(Pessoa pessoa) {
        pessoaDao.delete(pessoa);
    }    
}
