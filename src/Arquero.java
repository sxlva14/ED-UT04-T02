/**
 * @author Salvador Rodríguez Fernández
 * @since 24/01/2025
 */

public class Arquero extends Personaje{
    // Atributo propio
    protected String tipoFlechas;
    // Protected para la posibilidad de crear tipos de flechas como subclases

    // Constructor
    public Arquero(String nombre, double vida, String tipoFlechas) {
        super(nombre, vida);
        this.tipoFlechas = tipoFlechas;
    }

    // Método propio
    public void dispararFlechaPrecisa() {
        System.out.println(nombre + " le ha clavado una flecha al enemigo!");
    }

    // Sobreescribir método de la superclase
    @Override
    public void atacar() {
        System.out.println(nombre + " ha disparado una flecha al enemigo!");
    }

    // Sobrecarga del método dispararFlechaPrecisa
    public void dispararFlechaPrecisa(int cantidadFlechas) {
        System.out.println(nombre + " ha disparado " + cantidadFlechas + " flechas al enemigo!");
    }

    public void dispararFlechaPrecisa(int cantidadFlechas, String enemigo) {
        System.out.println(nombre + " ha disparado " + cantidadFlechas + " a " + enemigo + "!");
    }
}
