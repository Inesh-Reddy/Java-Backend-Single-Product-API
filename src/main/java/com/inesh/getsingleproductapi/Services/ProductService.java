package com.inesh.getsingleproductapi.Services;

import com.inesh.getsingleproductapi.Models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);
    List<Product> getAllProducts();
    Product createProduct(Product product);

}
