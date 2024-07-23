package org.productos.spring.java.productos2826502.services;

import java.util.List;

import org.productos.spring.java.productos2826502.entidades.Product;
import org.productos.spring.java.productos2826502.repositories.ProducRepository;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
    //inyectar la dependencia 
    //al repositorio

    private ProducRepository repository 
             = new ProducRepository();

    //operaciones de logica de negocio 
    //casos de uso, hsitorias de usuario
    //requerimientos funcionales

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

}
