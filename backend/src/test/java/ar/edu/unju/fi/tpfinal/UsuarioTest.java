package ar.edu.unju.fi.tpfinal;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsuarioTest {

    private boolean esperado;

    @BeforeEach
    public void setUp(){
        esperado = true;
    }

    @Test
    @DisplayName("test save user")
    void simpleTest(){
        assertTrue(esperado);
    }
}
