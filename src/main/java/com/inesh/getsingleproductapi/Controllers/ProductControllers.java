package com.inesh.getsingleproductapi.Controllers;


import com.inesh.getsingleproductapi.Models.Product;
import com.inesh.getsingleproductapi.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllers {

    //make the connection between the Service and the controller

    private ProductService productService;
    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping (value = "/FakeStore/Products/{id}")
    public Product getSingleProductById(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }
}
