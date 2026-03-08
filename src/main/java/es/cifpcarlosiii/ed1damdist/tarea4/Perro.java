package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un perro, un tipo de mamífero que añade comportamientos
 * específicos como ladrar y gruñir.
 *
 * @author javiermaltesmartin
 * @version 1.0
 */

public class Perro extends Mamifero {

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }
    /**
     * Muestra con qué otro animal se relaciona este perro.
     *
     * @param p Animal con el que se relaciona el perro.
     */

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }


}
