/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.Spring_libro.restControllers;

import com.mvc.Spring_libro.dao.LibroDao;
import com.mvc.Spring_libro.modelo.Libro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestLibroController {
    
    @Autowired
    private LibroDao libroDao;
    
    @GetMapping("libros")
    public List<Libro> listar(){
        return libroDao.findAll();
    }
    
    @PostMapping("libros")
    public Libro insertar(@RequestBody Libro libro){
        return libroDao.save(libro);
    }
    
    @PutMapping("libros")
    public void modificar(@RequestBody Libro libro){
        libroDao.save(libro);
    }
    
    @DeleteMapping("libros/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        libroDao.deleteById(id);
    }
    
}
