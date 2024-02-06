/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteTest {

    public PacienteTest() {
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

    // Verifica se os métodos setEmail e getEmail funcionam corretamente.
    @Test
    public void testSetAndGetEmail() {
        System.out.println("setAndGetEmail");
        Paciente paciente = new Paciente();
        String email = "test@example.com";
        paciente.setEmail(email);
        assertEquals(email, paciente.getEmail());
    }

    // Verifica se os métodos setConvenio e getConvenio funcionam corretamente.
    @Test
    public void testSetAndGetConvenio() {
        System.out.println("setAndGetConvenio");
        Paciente paciente = new Paciente();
        int convenio = 1;
        paciente.setConvenio(convenio);
        assertEquals(convenio, paciente.getConvenio());
    }

    // Verifica se os métodos setNome e getNome funcionam corretamente.
    
    @Test
    public void testSetAndGetNome() {
        System.out.println("setAndGetNome");
        Paciente paciente = new Paciente();
        String nome = "Fulano";
        paciente.setNome(nome);
        assertEquals(nome, paciente.getNome());
    }
}
