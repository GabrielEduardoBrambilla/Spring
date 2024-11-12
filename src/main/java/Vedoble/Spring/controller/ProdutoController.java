package Vedoble.Spring.controller;

import Vedoble.Spring.model.Produto;
import Vedoble.Spring.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto-meu")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/")
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.findAll());
    }

    @PostMapping("/")
    public ResponseEntity<>

}
