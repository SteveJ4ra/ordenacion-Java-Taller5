package ed.u2.sorting;

import java.util.Arrays;

public class SortingDemo {

    public static void main(String[] args) {
        System.out.println("====== INICIO DE PRUEBAS DE ORDENACIÓN ======");

        // Datasets Requeridos

        runTests("Dataset A = [8, 3, 6, 3, 9]", new int[] { 8, 3, 6, 3, 9 });
        runTests("Dataset B = [5, 4, 3, 2, 1] (Inverso)", new int[] { 5, 4, 3, 2, 1 });
        runTests("Dataset C = [1, 2, 3, 4, 5] (Ya ordenado)", new int[] { 1, 2, 3, 4, 5 });
        runTests("Dataset D = [2, 2, 2, 2] (Duplicados)", new int[] { 2, 2, 2, 2 });
        runTests("Dataset E = [9, 1, 8, 2]", new int[] { 9, 1, 8, 2 });

        // Casos Borde Requeridos

        runTests("Caso Borde: Arreglo de Tamaño 1", new int[] { 42 });
        runTests("Caso Borde: Arreglo Vacío", new int[] {});
        runTests("Caso Borde: Arreglo Nulo", null);

        System.out.println("\n====== FIN DE LAS PRUEBAS ======");
    }

    /*
     * Aquí ejecutaremos los 3 algoritmos de ordenación sobre un dataset.
     * Usa Arrays.copyOf para asegurar que cada algoritmo recibe una copia
     * idéntica del arreglo original.
     */
    private static void runTests(String title, int[] dataset) {
        System.out.println("\n==============================================");
        System.out.println("*** Probando: " + title + " ***");
        System.out.println("==============================================");

        // Creamos copias para que las pruebas "in-place" no interfieran
        int[] insertionData = (dataset == null) ? null : Arrays.copyOf(dataset, dataset.length);
        int[] selectionData = (dataset == null) ? null : Arrays.copyOf(dataset, dataset.length);
        int[] bubbleData = (dataset == null) ? null : Arrays.copyOf(dataset, dataset.length);

        // 1. Ejecutar InsertionSort
        InsertionSort.sort(insertionData, true); // true = activar traza

        // 2. Ejecutar SelectionSort
        SelectionSort.sort(selectionData, true);

        // 3. Ejecutar BubbleSort
        BubbleSort.sort(bubbleData, true);
    }
}