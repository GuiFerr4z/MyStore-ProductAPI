package com.guiferr.productapi.controller;

import com.guiferr.productapi.model.Product;
import com.guiferr.productapi.service.ProductService;

import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import java.util.List;

import com.guiferr.productapi.dto.ProductDTO;

@Tag(name = "Produtos")
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Product create(@Valid @RequestBody ProductDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public Product Update(@PathVariable Long id, @Valid @RequestBody ProductDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
