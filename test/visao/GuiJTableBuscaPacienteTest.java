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

/**
 *
 * @author edgul
 */
public class GuiJTableBuscaPacienteTest {
    
    public GuiJTableBuscaPacienteTest() {
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
    public void testPreencherTabelaAoAbrir() {
        System.out.println("preencherTabelaAoAbrir");
        GuiJTableBuscaPaciente gui = new GuiJTableBuscaPaciente();

        // Obtém o modelo de tabela da GUI
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) gui.getJtablePaciente().getModel();

        // Verifica se há pelo menos uma linha na tabela
        assertTrue(dtm.getRowCount() > 0);
    }
    
}
