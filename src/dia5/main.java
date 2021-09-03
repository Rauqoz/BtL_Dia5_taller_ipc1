package dia5;

/**
 *
 * @author Rauqoz
 */
public class main {

    public static void main(String[] args) {
        lista lista_estudiantes = new lista();

        lista_estudiantes.agregar_datos("gustavo", 23);

        lista_estudiantes.agregar_datos("pablo", 20);

        lista_estudiantes.agregar_datos("cindy", 65);

        lista_estudiantes.agregar_datos("damaris", 22);

        System.out.println(lista_estudiantes.tamaño_l);

        lista_estudiantes.imprimir_datos();

        lista_estudiantes.modificar_dato("pablo", "raul", 20, 17);

        System.out.println(lista_estudiantes.tamaño_l);

        lista_estudiantes.imprimir_datos();

    }

}
