/**
 * @author Salvador Rodríguez Fernández
 * @since 24/01/2025
 */

public class Mago extends Personaje {
    // Atributo propio
    protected String nivelMagia;
    // Protected para la posibilidad de crear niveles de magia como subclases

    // Constructor
    public Mago (String nombre, double vida, String nivelMagia) {
        super(nombre, vida);
        this.nivelMagia = nivelMagia;
    }

    // Método propio
    public void lanzarHechizo() {
        System.out.println(nombre + " ha lanzado un hechizo!");
    }

    // Método de la superclase
    public void atacarEnemigo() {
        super.atacar();
    }
}
