package Vedoble.Spring.controller;

import Vedoble.Spring.entity.Usuario;
import Vedoble.Spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> findAllUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> findByIdUsuario(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsuario(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }

}
