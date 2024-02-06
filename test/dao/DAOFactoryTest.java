/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 

/**
 *
 * @author edgul
 */
public class DAOFactoryTest {
    
    public DAOFactoryTest() {
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

  // Verifica se o método getPacienteDAO retorna uma instância válida de PacienteDAO.
    
    @Test
    public void testGetPacienteDAO() {
        System.out.println("getPacienteDAO");
        PacienteDAO result = DAOFactory.getPacienteDAO();
        assertTrue(result instanceof PacienteDAO);
    }
    
    // Verifica se o método getConvenioDAO retorna uma instância válida de ConvenioDAO.
    
    @Test
public void testGetConvenioDAO() {
    System.out.println("getConvenioDAO");
    ConvenioDAO result = DAOFactory.getConvenioDAO();
    assertTrue(result instanceof ConvenioDAO);
}

    
    
}
