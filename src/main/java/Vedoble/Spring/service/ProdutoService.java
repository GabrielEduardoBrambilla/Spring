package Vedoble.Spring.service;

import Vedoble.Spring.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    Produto save(Produto p);
    List<Produto> findAll();
    Optional<Produto> findById();
    Produto update(Produto p);
    void deleteById(Long id);
}
