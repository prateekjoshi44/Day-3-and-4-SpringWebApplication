package com.Prateek.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDB db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public void addProduct(Product p){
//        products.add(p);
            db.save(p);

    }
    public Product getProduct(String name){
//        for(Product p: products){
//            if(p.getPlace().equals(name))
//                return p;
//        }
        return db.findByName(name);
    }
//
//
//public List<Product> getProductWithText(String text) {
//    return db.getProducts(text);
////    List<Product> products = productService.getProdByText("black");
//}
//public List<Product>getProductsbyPlace(String place){
//    return db.findByPlace(place);
//}


//public List<Product> searchProduct(String text){
//    List<Product> productList= productDb.findAll();
//    List<Product> productOutOfWarranty=new ArrayList<>();
//    for(Product p:productList) {
//        if(p.getName().toLowerCase().contains(text.toLowerCase())||p.getPlace().toLowerCase().contains(text.toLowerCase())||p.getType().toLowerCase().contains(text.toLowerCase())) {
//            productOutOfWarranty.add(p);
//        }
//    }
//    return productOutOfWarranty;
//}
//
//    public List<Product> getAllProductOutOfWarranty(){
//        List<Product> productList= productDb.findAll();
//        List<Product> productOutOfWarranty=new ArrayList<>();
//        for(Product p:productList) {
//            if(p.getWarranty()<2023) {
//                productOutOfWarranty.add(p);
//            }
//        }
//        return productOutOfWarranty;
//    }


}
