package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un gato, un tipo de mamífero que añade comportamientos
 * específicos como maullar y dormir durante largos periodos.
 *
 * @author javiermaltesmartin
 * @version 1.0
 */

public class Gato extends Mamifero {

    public int pelos;

    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Muestra con qué otro animal se relaciona este gato.
     *
     * @param p Animal con el que se relaciona el gato.
     */

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
