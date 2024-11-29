package com.chamba.shopping.serviceimpl;

import com.chamba.shopping.entity.Product;
import com.chamba.shopping.repository.IProductRepository;
import com.chamba.shopping.service.IProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductServiceImplTest {

    @Mock
    private IProductRepository pRepo; // Mock del repositorio

    @InjectMocks
    private IProductService pService; // Servicio con inyección de mocks

    public ProductServiceImplTest() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks
    }

    @Test
    void devolerUnaLista(){
        List<Product> productosMock = Arrays.asList(new Product(), new Product());
        when(pRepo.findAll()).thenReturn(productosMock);

        List<Product> resultado = pService.getProducts();

        assertNotNull(resultado);
    }

    @Test
    void simpleTestParaComprobarWorkflow(){
        boolean test = true;

        assertTrue(test);
    }

}