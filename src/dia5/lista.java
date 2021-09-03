package dia5;

public class lista {

    //manejo de los nodos
    public nodo inicio_l;
    public nodo final_l;
    public int tamaño_l;
    public nodo temporal;

    public lista() {
        this.inicio_l = null;
        this.final_l = null;
        this.tamaño_l = 0;
        this.temporal = null;
    }

    public void agregar_datos(String nombre_externo, int edad_externo) {
        if (tamaño_l == 0) {
            nodo nuevo_dato = new nodo(nombre_externo, edad_externo);
            inicio_l = nuevo_dato;
            final_l = nuevo_dato;
            tamaño_l += 1;
        } else {
            tamaño_l += 1;
            nodo nuevo_dato = new nodo(nombre_externo, edad_externo);
            final_l.siguiente = nuevo_dato;
            final_l = nuevo_dato;

        }

    }

    public void imprimir_datos() {
        //si: damaris, ergon, imer, cindy, adriana, karen, julio
        //depende: pablo <- no hacerle caso! urgente
        //no: ramiro, rodolfo

        if (tamaño_l != 0) {
            temporal = inicio_l;
            do {
                System.out.println(temporal.nombre + " tiene " + temporal.edad + " años");
                temporal = temporal.siguiente;

            } while (temporal != null);
        }
        System.out.println("---------fin de datos---------");

    }

    public void modificar_dato(String nombre_viejo, String nombre_nuevo, int edad_vieja, int edad_nueva) {

        if (tamaño_l != 0) {
            temporal = inicio_l;
            do {
                if (temporal.nombre == nombre_viejo && temporal.edad == edad_vieja) {
                    temporal.nombre = nombre_nuevo;
                    temporal.edad = edad_nueva;
                    break;
                } else {
                    temporal = temporal.siguiente;
                }

            } while (temporal != null);
        }

    }

}
