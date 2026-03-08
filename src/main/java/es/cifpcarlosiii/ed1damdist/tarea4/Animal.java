package es.cifpcarlosiii.ed1damdist.tarea4;
/**
 * Representa un animal genérico con comportamientos básicos como comer,
 * dormir, reproducirse y relacionarse con otros animales.
 *
 * @author javiermaltesmartin
 * @version 1.0
 */
public class Animal {

    private String nombre;

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }
    /**
     * Muestra con qué otro animal se relaciona este animal.
     *
     * @param a Animal con el que se relaciona.
     */

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }
    /**
     * Obtiene el nombre del animal.
     *
     * @return Nombre del animal.
     */

    private String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     *
     * @param nombre Nombre a asignar al animal.
     */

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
