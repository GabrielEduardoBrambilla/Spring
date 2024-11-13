package Vedoble.Spring.service;

import Vedoble.Spring.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UsuarioService {

    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario update(Usuario usuario);
    void deleteById(Long id);
}
