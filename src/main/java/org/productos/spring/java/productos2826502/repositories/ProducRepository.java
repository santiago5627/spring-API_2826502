package org.productos.spring.java.productos2826502.repositories;

import java.util.List;

import org.productos.spring.java.productos2826502.entidades.Product;
import org.springframework.stereotype.Repository;

@Repository

    //la lista de un repository
    //debe ser inmutable
    //la logica de negocio no modifica
    //la lista de un repo

public class ProducRepository {
    List<Product> productos = List.of(
        Product.builder()
                .id(1L)
                .nombre("Silla Reciente")
                .precio(23122323.0)
                .build()
                ,
        new Product(2L, "Escritorio", 2000000.0)
        );

    //metodo(comportamiento) para consultar todos
    //todos productos del repository
    public List<Product> findAll(){
        return this.productos;
    }
}
