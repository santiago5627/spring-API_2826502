package org.productos.spring.java.productos2826502.controllers;

import java.util.List;

import org.productos.spring.java.productos2826502.entidades.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api/products")


public class ProductController {
    //Inyectar el servivio
    private ProductService service = 
                new ProductService();
    //Primer metodo
    //Endpoint:un metodo en un controlador
    
    @GetMapping("/saludo")
    public String saludo(){
        return "hola...2826502";
    }
    //segundo end porint
    //get:sirve para obtener informacion sin alterarla
    //(inmutable)

    @GetMapping("/{idproducto}")
    public String finProductdById(@PathVariable String idproducto) {
        return "aqui se mostrara el producto cuyo id es:" + idproducto;
    }

    @GetMapping
    public List<Product> findAllProducto() {
        //utilizo el servicio
        return service.findAllProducts();

    }
    
    
}
