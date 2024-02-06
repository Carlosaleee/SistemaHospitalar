package dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteDAOTeste {

    private static PacienteDAO pacienteDAO;

    public PacienteDAOTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
        pacienteDAO = new PacienteDAO();
    }

    @AfterClass
    public static void tearDownClass() {
        pacienteDAO = null;
    }

    @Before
    public void setUp() {
        // Inicialização de dados de teste, se necessário.
    }

    @After
    public void tearDown() {
        // Limpeza de dados de teste, se necessário.
    }

    @Test
    public void testeCadastrarPacienteComSucesso() {
        try {
            // Crie um objeto Paciente com dados válidos
            Paciente paciente = new Paciente();
            paciente.setNome("Nome do Paciente");
            paciente.setEndereco("Endereço do Paciente");
            paciente.setDataNascimento(new SimpleDateFormat("yyyy/MM/dd").parse("1990/01/01"));
            paciente.setTelefone("123456789");
            paciente.setCpf("12345678901");
            paciente.setRg("1234567");
            paciente.setIdConvenio(1);

            // Tente cadastrar o paciente
            pacienteDAO.cadastrarPaciente(paciente);

            // Se não lançar exceção, o teste passou
            assertTrue(true);
        } catch (SQLException | ParseException ex) {
            fail("Erro ao cadastrar paciente: " + ex.getMessage());
        }
    }
    
     @Test
    public void testeBuscarTodosOsPacientes() {
        try {
            // Tente buscar todos os pacientes
            ArrayList<Paciente> pacientes = pacienteDAO.buscarPaciente();

            // Verifique se a lista não está vazia
            assertFalse(pacientes.isEmpty());
        } catch (SQLException ex) {
            fail("Erro ao buscar todos os pacientes: " + ex.getMessage());
        }
    }

    @Test
    public void testeBuscarPacientePorFiltro() {
        try {
            // Tente buscar pacientes com um filtro específico
            ArrayList<Paciente> pacientes = pacienteDAO.buscarPacienteFiltro("WHERE NOME LIKE '%Teste%'");

            // Verifique se a lista não está vazia
            assertFalse(pacientes.isEmpty());
        } catch (SQLException ex) {
            fail("Erro ao buscar pacientes por filtro: " + ex.getMessage());
        }
    }


}

