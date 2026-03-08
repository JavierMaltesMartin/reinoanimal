package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase principal de la aplicación. Demuestra el uso de la jerarquía
 * de clases del reino animal y el polimorfismo mediante perros y gatos.
 *
 * Crea varios objetos, realiza conversiones de tipos y recorre un array
 * para identificar el tipo concreto de cada elemento.
 *
 * @author javiermaltesmartin
 * @version 1.0
 */

public class Principal {
    /**
     * Punto de entrada de la aplicación. Ejecuta ejemplos de polimorfismo
     * y uso de la jerarquía Animal-Mamifero-Perro-Gato.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal();

        Mamifero mamifero = new Mamifero();

        Perro toby = new Perro();

        Gato isidoro = new Gato();
        isidoro.pelos = 4;

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.pelos);

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
