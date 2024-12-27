package com.inesh.getsingleproductapi.Services;

import com.inesh.getsingleproductapi.Dtos.FakeStoreProductDto;
import com.inesh.getsingleproductapi.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    private final RestTemplate restTemplate;

    private FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;;
    }

    public Product getSingleProduct(Long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class
        );
        return fakeStoreProductDto.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
