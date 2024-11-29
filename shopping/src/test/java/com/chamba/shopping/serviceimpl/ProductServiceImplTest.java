package com.chamba.shopping.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.chamba.shopping.entity.Product;
import com.chamba.shopping.repository.IProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class) // Inicializa los mocks automáticamente
class ProductServiceImplTest {

    @Mock
    private IProductRepository pRepo; // Mock del repositorio

    @InjectMocks
    private ProductServiceImpl pService; // Servicio con inyección de mocks

    @Test
    void devolerUnaLista() {
        // Simulación del repositorio
        List<Product> productosMock = Arrays.asList(new Product(), new Product());
        when(pRepo.findAll()).thenReturn(productosMock);

        // Llamada al método del servicio
        List<Product> resultado = pService.getProducts();

        // Verificaciones
        assertNotNull(resultado);
        assertEquals(2, resultado.size());
        verify(pRepo, times(1)).findAll(); // Verifica que el método se llamó exactamente una vez
    }

    @Test
    void simpleTestParaComprobarWorkflow() {
        boolean test = true;

        assertTrue(test);
    }
}
