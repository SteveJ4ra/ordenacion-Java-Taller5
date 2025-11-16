package ed.u2.sorting;

import java.util.Arrays;
public final class SelectionSort {

    public static void sort(int[] array) {
        sort(array, false);
    }

    public static void sort(int[] array, boolean trace) {

        // Llamamos al validador de Utils.
        if (!SortingUtils.preSortValidation(array, trace, "SelectionSort")) {
            return;
        }

        // Si llegamos aquí, el arreglo es válido y > 1
        int arrayLength = array.length;
        int swapCount = 0; // Contabilizar swaps

        // Bucle externo: avanza la posición del sub-arreglo ordenado
        for (int fillIndex = 0; fillIndex < arrayLength - 1; fillIndex++) {

            // Encuentra el índice del elemento mínimo en el resto del arreglo
            int minIndex = fillIndex;
            for (int scanIndex = fillIndex + 1; scanIndex < arrayLength; scanIndex++) {
                if (array[scanIndex] < array[minIndex]) {
                    minIndex = scanIndex;
                }
            }

            // Realiza el intercambio (swap) solo si es necesario
            if (minIndex != fillIndex) {
                SortingUtils.swap(array, fillIndex, minIndex);
                swapCount++; // Incrementa el contador de swaps
            }

            if (trace) {
                System.out.println("Paso " + (fillIndex + 1) + " (min=" + array[fillIndex] + "): " + Arrays.toString(array));
            }
        }

        if (trace) {
            System.out.println("Finalizado. Total Swaps: " + swapCount);
        }
    }
}