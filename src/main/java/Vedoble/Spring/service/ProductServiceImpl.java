package Vedoble.Spring.service;

import Vedoble.Spring.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl  implements ProductService{
    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
