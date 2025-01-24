/**
 * @author Salvador Rodríguez Fernández
 * @since 24/01/2025
 */

public class Guerrero extends Personaje {
    // Atributo propio
    protected String tipoArma;
    // Protected para la posibilidad de crear armas como subclases

    // Constructor
    public Guerrero(String nombre, double vida, String tipoArma) {
        super(nombre, vida);
        this.tipoArma = tipoArma;
    }

    // Método propio
    public void bloquearAtaque() {
        System.out.println(nombre + " ha bloqueado el ataque!");
    }
}
