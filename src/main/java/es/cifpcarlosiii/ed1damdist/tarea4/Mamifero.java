package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un mamífero, un tipo de animal cuya reproducción es vivípara.
 * Extiende la funcionalidad de la clase Animal.
 *
 * @author javiermaltesmartin
 * @version 1.0
 */

public class Mamifero extends Animal {

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Muestra con qué otro animal se relaciona este mamífero.
     *
     * @param m Animal con el que se relaciona el mamífero.
     */

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }

    /**
     * Devuelve una representación en texto del mamífero.
     *
     * @return Nombre del mamífero.
     */

    @Override
    public String toString() {
        return this.getNombre();


    }
}
