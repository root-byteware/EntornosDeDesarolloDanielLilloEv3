package modelo;

/**
 * Clase que representa un gato, que es un tipo de Animal.
 * Implementa el metodo sonido() para emitir un maullido.
 *
 * @author Daniel Lillo López
 * @version 1.0
 */
public class Gato extends Animal {

    /**
     * Crea un nuevo gato con el nombre especificado.
     *
     * @param nombre el nombre del gato
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Devuelve el sonido característico de un gato.
     */
    @Override
    public String sonido() {
        return "¡Miau!";
    }
}
