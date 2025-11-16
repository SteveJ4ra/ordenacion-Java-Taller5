package ed.u2.sorting;

import java.util.Arrays;

public final class BubbleSort {

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean trace) {

        // Llamamos al validador de Utils.
        if (!SortingUtils.preSortValidation(array, trace, "BubbleSort")) {
            return;
        }

        // Si llegamos aquí, el arreglo es válido y > 1
        int arrayLength = array.length;
        boolean swapped;

        // Bucle externo: representa cada "pasada"
        for (int passIndex = 0; passIndex < arrayLength - 1; passIndex++) {
            swapped = false;
            // Bucle interno: realiza las comparaciones adyacentes
            for (int innerIndex = 0; innerIndex < arrayLength - passIndex - 1; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    // Intercambia adyacentes mal ordenados
                    SortingUtils.swap(array, innerIndex, innerIndex + 1);
                    swapped = true;
                }
            }

            if (trace) {
                System.out.println("Pasada " + (passIndex + 1) + ": " + Arrays.toString(array));
            }

            // Optimización: Corte temprano si no hubo swaps en una pasada
            if (!swapped) {
                if (trace) {
                    System.out.println("Corte temprano: El arreglo ya está ordenado.");
                }
                break;
            }
        }
    }
}