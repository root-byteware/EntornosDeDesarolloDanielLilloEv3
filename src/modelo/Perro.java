package modelo;

/**
 * Clase que representa un perro, que es un tipo de Animal.
 * Implementa el metodo sonido() para emitir un ladrido.
 *
 * @author Daniel Lillo López
 * @version 1.0
 */
public class Perro extends Animal {

    /**
     * Crea un nuevo perro con el nombre especificado.
     *
     * @param nombre el nombre del perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Devuelve el sonido característico de un perro.
     */
    @Override
    public String sonido() {
        return "¡Guau!";
    }
}
