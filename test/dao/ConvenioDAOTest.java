/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import java.sql.SQLException;

/**
 *
 * @author edgul
 */
public class ConvenioDAOTest {

    public ConvenioDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // Verifica se o método buscarConvenioFiltro retorna null quando não há resultados para um filtro.
    @Test
    public void testeBuscarConvenioPorFiltroSemResultado() {
        System.out.println("buscarConvenioPorFiltroSemResultado");
        ConvenioDAO convenioDAO = new ConvenioDAO();
        try {
            Convenio convenio = convenioDAO.buscarConvenioFiltro("FiltroInexistente");
            assertNull(convenio);
        } catch (SQLException ex) {
            fail("Erro ao buscar convênio por filtro sem resultado: " + ex.getMessage());
        }
    }

    // Buscar todos os Convenios
    @Test
    public void testeBuscarTodosConvenios() {
        System.out.println("buscarTodosConvenios");
        ConvenioDAO convenioDAO = new ConvenioDAO();
        try {
            ArrayList<Convenio> convenios = convenioDAO.buscarcConvenios();
            assertFalse(convenios.isEmpty());
        } catch (SQLException ex) {
            fail("Erro ao buscar todos os convênios: " + ex.getMessage());
        }
    }

// Buscar comvenio por filtro.
    @Test
    public void testBuscarConvenioPorFiltro() {
        System.out.println("buscarConvenioPorFiltro");
        ConvenioDAO convenioDAO = new ConvenioDAO();
        try {
            Convenio convenio = convenioDAO.buscarConvenioFiltro("Amil");
            assertNotNull(convenio);
        } catch (SQLException ex) {
            fail("Erro ao buscar convênio por filtro: " + ex.getMessage());
        }
    }

    // Verifica se o método buscarConvenioFiltro retorna null quando não há resultados para um filtro.
    
    @Test
    public void testBuscarConvenioPorFiltroSemResultado() {
        System.out.println("buscarConvenioPorFiltroSemResultado");
        ConvenioDAO convenioDAO = new ConvenioDAO();
        try {
            Convenio convenio = convenioDAO.buscarConvenioFiltro("FiltroInexistente");
            assertNull(convenio);
        } catch (SQLException ex) {
            fail("Erro ao buscar convênio por filtro sem resultado: " + ex.getMessage());
        }
    }

}
