/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.ConexaoBanco;

public class ConvenioTeste {
    
    public ConvenioTeste() {
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
    
        
    @Test
    public void testGetIdConvenio() {
        System.out.println("getIdConvenio");
        Convenio convenio = new Convenio();
        int expResult = 0;
        int result = convenio.getIdConvenio();
        assertEquals(expResult, result);
        
    }

     @Test
    public void testGetIdConvenio02() {
        System.out.println("getIdConvenio");
        Convenio convenio = new Convenio();
        int result = convenio.getIdConvenio();
        assertNotNull(convenio);
    
    }
   
    // Verifica se é possível definir o ID do convênio corretamente.
    
    @Test
public void testeSetIdConvenio() {
    System.out.println("setIdConvenio");
    Convenio convenio = new Convenio();
    int expResult = 1;
    convenio.setIdConvenio(expResult);
    assertEquals(expResult, convenio.getIdConvenio());
}

// Verifica se é possível definir o nome do convênio corretamente.

@Test
public void testeSetNomeConvenio() {
    System.out.println("setNomeConvenio");
    Convenio convenio = new Convenio();
    String expResult = "Nome do Convênio";
    convenio.setNomeConvenio(expResult);
    assertEquals(expResult, convenio.getNomeConvenio());
}

}
