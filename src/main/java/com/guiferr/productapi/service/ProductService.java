package com.guiferr.productapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guiferr.productapi.model.Product;
import com.guiferr.productapi.repository.ProductRepository;
import com.guiferr.productapi.dto.ProductDTO;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    //lista todos os produtos
    public List<Product> findAll() {
        return repository.findAll();
    }

    //criar produto
    public Product save(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.name());
        product.setPrice(dto.price());
        product.setQuantity(dto.quantity());

        return repository.save(product);
    }

    //deletar produto
    public void delete(Long id) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        repository.delete(existing);
    }

    //atualizar produto

    public Product update(Long id, ProductDTO dto) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        existing.setName(dto.name());
        existing.setPrice(dto.price());
        existing.setQuantity(dto.quantity());

        return repository.save(existing);
    }
}
