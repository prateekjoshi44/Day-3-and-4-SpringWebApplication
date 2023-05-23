package com.Prateek.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    //get all products
    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return service.getAllProducts();
    }

    //get 1 product by name
    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name){

        return service.getProduct(name);
    }

    //Add a product  to db
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){

        service.addProduct(p);
    }


//
////    Get Product By out of warranty
//    @GetMapping("/getAllProductOutOfWarranty")
//    public List<Product> getAllProductOutOfWarranty() {
//        return service.getAllProductOutOfWarranty();
//    }
}
