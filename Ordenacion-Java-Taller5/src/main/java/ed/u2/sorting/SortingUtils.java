package ed.u2.sorting;

import java.util.Arrays;

public final class SortingUtils {

    //Intercambia dos elementos dentro de un arreglo.

    public static void swap(int[] array, int indexA, int indexB) {
        int swapHolder = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swapHolder;
    }

    //Realiza la validación previa de casos borde (nulo, 0, 1) e imprime la cabecera de la traza.
    public static boolean preSortValidation(int[] array, boolean trace, String algorithmName) {
        if (trace) {
            System.out.println("--- Traza de " + algorithmName + " ---");
        }

        if (array == null) {
            if (trace) System.out.println("Arreglo nulo. No se puede ordenar.");
            return false; // No continuar
        }

        if (array.length <= 1) {
            if (trace) System.out.println("Arreglo de tamaño " + array.length + ". No se requiere ordenación.");
            return false; // No continuar
        }

        // Si es válido, imprime el original y permite continuar
        if (trace) {
            System.out.println("Original: " + Arrays.toString(array));
        }

        return true; // Sí, continuar
    }
}