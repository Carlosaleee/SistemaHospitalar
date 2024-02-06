/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package visao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servicos.ConvenioServicos;
import servicos.PacienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author edgul
 */
public class GuiCadPacienteTest {
    
    public GuiCadPacienteTest() {
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

   // Verifique se a instância obtida não é nula.
    
    @Test
    public void testGetPacienteServicos() {
        System.out.println("getPacienteServicos");
        PacienteServicos pacienteServicos = ServicosFactory.getPacienteServicos();
        assertNotNull(pacienteServicos);
        assertTrue(pacienteServicos instanceof PacienteServicos);
    }
    
    @Test
    public void testGetConvenioServicos() {
        System.out.println("getConvenioServicos");
        ConvenioServicos convenioServicos = ServicosFactory.getConvenioServicos();
        assertNotNull(convenioServicos);
        assertTrue(convenioServicos instanceof ConvenioServicos);
    }
    
}
