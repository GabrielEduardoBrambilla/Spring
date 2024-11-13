package Vedoble.Spring.service;

import Vedoble.Spring.entity.Produto;
import Vedoble.Spring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto save(Produto p) {
        return produtoRepository.save(p);
    }

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto update(Produto p) {
        return produtoRepository.save(p);
    }

    @Override
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}
