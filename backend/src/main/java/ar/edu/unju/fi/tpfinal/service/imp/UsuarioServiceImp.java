package ar.edu.unju.fi.tpfinal.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tpfinal.entity.Usuario;
import ar.edu.unju.fi.tpfinal.repository.UsuarioRepository;
import ar.edu.unju.fi.tpfinal.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return userRepository.save(usuario);
    }

    @Override
    public Usuario edit(Usuario usuario, int id) {
        userRepository.findById(id).orElseThrow();

        usuario.setId(id);
        return userRepository.save(usuario);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<Usuario> getAll() {
        return userRepository.findAll();
    }
    
}
