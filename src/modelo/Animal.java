package modelo;

/**
 * Clase abstracta que representa un animal genérico con un nombre
 * y requiere que las subclases implementen el metodo sonido().
 *
 * @author Daniel Lillo López
 * @version 1.0
 */

public abstract class Animal {

    private String nombre;

    /**
     * Constructor que inicializa el nombre del animal.
     *
     * @param nombre el nombre del animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del animal.
     *
     * @return el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el animal.
     *
     * @param nombre el nuevo nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en cadena del objeto Animal.
     *
     * @return una cadena con el nombre del animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * Metodo abstracto que debe implementar cada subclase para devolver un sonido.
     */
    public abstract String sonido();
}