/**
 * @author Salvador Rodríguez Fernández
 * @since 24/01/2025
 */

public class Personaje {
    // Atributos
    protected String nombre;
    protected double vida;
    // Usamos protected para que las subclases puedan acceder sin usar getters y setters

    // Constructor
    public Personaje(String nombre, double vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    // Métodos
    public void moverse() {
        System.out.println(nombre + " se mueve hacia delante!");
    }

    public void atacar() {
        System.out.println(nombre + " ataca al enemigo de enfrente!");
    }
}
