package Vedoble.Spring.service;

import Vedoble.Spring.entity.Produto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProdutoService {

    Produto save(Produto p);
    List<Produto> findAll();
    Optional<Produto> findById(Long id);
    Produto update(Produto p);
    void deleteById(Long id);
}
