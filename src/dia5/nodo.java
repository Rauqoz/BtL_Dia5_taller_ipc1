package dia5;

public class nodo {

    public String nombre;
    public int edad;
    public nodo siguiente;

    public nodo(String nombre_externo, int edad_externa) {
        this.nombre = nombre_externo;
        this.edad = edad_externa;
        this.siguiente = null;
    }

}
