package ar.edu.unju.fi.tpfinal.service;

import java.util.List;

import org.springframework.stereotype.Service;
import ar.edu.unju.fi.tpfinal.entity.Usuario;

@Service
public interface UsuarioService {
    
    Usuario save(Usuario usuario);

    Usuario edit(Usuario usuario, int id);

    List<Usuario> getAll();

    void delete(int id);
}
