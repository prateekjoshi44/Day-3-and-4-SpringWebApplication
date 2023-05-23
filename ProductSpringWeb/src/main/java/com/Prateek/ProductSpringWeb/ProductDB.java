//package com.telusko.ProductSpring;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ProductDB extends JpaRepository<Product, Integer> {
//
//    @Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword%")
//    List<Product> getProducts(@Param("keyword") String keyword);
//}
package com.Prateek.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
//    @Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword%")
//    List<Product> getProducts(@Param("keyword") String keyword);

    Product findByName(String name);
    List <Product> findByPlace(String place);

}
