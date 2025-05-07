package test;

import modelo.Perro;
import modelo.Gato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testSonidoPerro() {

        Perro perro = new Perro("Firulais");

        assertEquals("¡Guau!", perro.sonido());
    }

    @Test
    void testSonidoGato() {

        Gato gato = new Gato("Michi");

        assertEquals("¡Miau!", gato.sonido());
    }
}
