package com.example.chapter_08.controllers;

import com.example.chapter_08.model.Product;
import com.example.chapter_08.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProduct(
//            @RequestParam String name,
//            @RequestParam double price,
            Product product,
            Model model
    ) {
//        Product product = new Product();
//        product.setName(name);
//        product.setPrice(price);
        productService.addProduct(product);

        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
