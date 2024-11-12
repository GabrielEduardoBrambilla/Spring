package Vedoble.Spring.service;

import Vedoble.Spring.model.Produto;

import java.util.List;
import java.util.Optional;

public class ProdutoServiceImpl implements ProdutoService{



    @Override
    public Produto save(Produto p) {
        return null;
    }

    @Override
    public List<Produto> findAll() {
        return List.of();
    }

    @Override
    public Optional<Produto> findById() {
        return Optional.empty();
    }

    @Override
    public Produto update(Produto p) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
