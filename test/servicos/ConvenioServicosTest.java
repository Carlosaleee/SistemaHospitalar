/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package servicos;

import java.util.ArrayList;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConvenioServicosTest {
    
    public ConvenioServicosTest() {
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

    /* Este teste verifica se a lista de convênios retornada pelo método 
    buscarConvenio não está vazia.  */

    @Test
    public void testBuscarConvenio() {
        System.out.println("buscarConvenio");
        ConvenioServicos convenioServicos = new ConvenioServicos();
        try {
            ArrayList<Convenio> convenios = convenioServicos.buscarConvenio();
            assertFalse(convenios.isEmpty());
        } catch (SQLException ex) {
            fail("Erro ao buscar convênios: " + ex.getMessage());
        }
    }
}
    

