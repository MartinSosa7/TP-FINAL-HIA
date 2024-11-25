package ar.edu.unju.fi.tpfinal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.tpfinal.entity.Usuario;
import ar.edu.unju.fi.tpfinal.service.UsuarioService;

@SpringBootTest
public class UsuarioTest {
    
    @Autowired
    private UsuarioService uService;

    private Usuario userTest;

    @BeforeAll
    public void setUp(){
        userTest.setNombres("nombre");
        userTest.setApellido("apellido");
        userTest.setDni("111111111");
        userTest.setEmail("mail@mail.com");
        userTest.setActivo(true);
        userTest.setPassword("password");
        userTest.setTelefono("5555555");
    }

    @Test
    @DisplayName("test save user")
    void saveUsuario(){
        Usuario savedUser = uService.save(userTest);
        assertNotNull(savedUser);
        uService.delete(savedUser.getId());
    }
}
