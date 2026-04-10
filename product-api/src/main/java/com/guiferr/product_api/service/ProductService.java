package com.guiferr.product_api.service;

import com.guiferr.product_api.model.Product;
import com.guiferr.product_api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Product save(Product product) {
        return repository.save(product);
    }

    //deletar produto
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //atualizar produto

    public Product update(Long id, Product product) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setQuantity(product.getQuantity());

        return repository.save(existing);
    }
}
