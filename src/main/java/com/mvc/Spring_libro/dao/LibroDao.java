/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.Spring_libro.dao;


import com.mvc.Spring_libro.modelo.Libro;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LibroDao extends CrudRepository<Libro, Integer> {

    @Override
    public List<Libro> findAll();

}

