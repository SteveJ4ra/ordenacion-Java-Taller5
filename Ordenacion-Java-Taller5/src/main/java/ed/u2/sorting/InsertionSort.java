package ed.u2.sorting;

import java.util.Arrays;

public final class InsertionSort {

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean trace) {

        // Llamamos al validador de Utils.
        // Si retorna 'false', nos detenemos (es un caso borde).
        if (!SortingUtils.preSortValidation(array, trace, "InsertionSort")) {
            return;
        }

        // Si llegamos aquí, el arreglo es válido y > 1
        int arrayLength = array.length;

        // Bucle externo: comienza desde el segundo elemento (índice 1)
        for (int currentIndex = 1; currentIndex < arrayLength; ++currentIndex) {
            int keyToInsert = array[currentIndex];
            int scanIndex = currentIndex - 1;

            /*
             * Mueve los elementos de array[0..currentIndex-1] que son mayores que
             * la 'keyToInsert', una posición hacia adelante de su posición actual.
             */
            while (scanIndex >= 0 && array[scanIndex] > keyToInsert) {
                array[scanIndex + 1] = array[scanIndex];
                scanIndex = scanIndex - 1;
            }
            array[scanIndex + 1] = keyToInsert;

            if (trace) {
                System.out.println("Iteración " + currentIndex + " (insertando " + keyToInsert + "): " + Arrays.toString(array));
            }
        }
    }
}