package ar.edu.unlp.info.oo2.biblioteca;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Socio aria;
    private Socio tyron;

    private VoorheesExporter voorheesExporter;

    @BeforeEach
    public void setUp(){
        biblioteca= new Biblioteca();
        aria = new Socio("Arya Stark","needle@stark.com","5234-5");
        tyron = new Socio("Tyron Lannister","tyron@thelannisters.com", "2345-2");
        voorheesExporter = new VoorheesExporter();
        biblioteca.agregarSocio(aria);
        biblioteca.agregarSocio(tyron);
        biblioteca.setExporter(voorheesExporter);
    }

    @Test
    public void bibliotecaTest(){
        Assertions.assertNotEquals(biblioteca.exportarSocios(),"");
    }
}
