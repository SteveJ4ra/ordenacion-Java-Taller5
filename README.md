<a name="readme-top"></a>

# Taller Grupal - Ordenación En Java

>InsertionSort · SelectionSort · BubbleSort

Este repositorio contiene la implementación de tres algoritmos de ordenación in-place como parte del Taller 5 de la asignatura Estructura de Datos.
Incluye trazas opcionales, manejo de casos borde y una clase para ejecutar los datasets oficiales de la guía.

---

## Estructura del paquete
> Se utilizó la estructura solicitada en la guía:
**ed.u2.sorting**
Esto permite mantener cohesión en el código y facilitar la evaluación por parte del docente.

---

## Implementaciones in-place

Los algoritmos modifican directamente el arreglo original, sin utilizar arreglos auxiliares.
Esto cumple con lo requerido y permite observar realmente los movimientos internos de cada técnica.

[Repositorio en GitHub](https://github.com/SteveJ4ra/ordenacion-Java-Taller5.git)

---

## Sobrecarga para trazas

Cada clase incluye una versión:
**sort(int[] a, boolean trace)**
El parámetro trace permite:

Mostrar comparaciones

> Mostrar intercambios o desplazamientos

> Imprimir el arreglo en cada iteración

> Visualizar el comportamiento interno del algoritmo


### BubbleSort con corte temprano

Se incluyó la optimización:
*if (!swapped) break;*
Esto permite que el algoritmo termine antes cuando el arreglo ya está ordenado, reduciendo drásticamente el tiempo en listas casi ordenadas.


### Clase SortingDemo

La clase SortingDemo permite:

> Ejecutar los algoritmos con todos los datasets oficiales

> Validar resultados

> Activar trazas si se desea

> Facilitar pruebas en consola o IDE

### Cómo Ejecutar el Proyecto
 Compilar

Desde la raíz del proyecto:

> javac src/ed/u2/sorting/*.java

 Ejecutar

Ejecutar la clase principal:

> java -cp src ed.u2.sorting.SortingDemo


Esto mostrará:

Resultados ordenados

Trazas opcionales

Validación de los datasets oficiales

Datasets Oficiales

Los datos recomendados por la guía son:

A = [8, 3, 6, 3, 9]

B = [5, 4, 3, 2, 1]

C = [1, 2, 3, 4, 5]

D = [2, 2, 2, 2]

E = [9, 1, 8, 2]

 Resultados esperados

A → [3, 3, 6, 8, 9]

B → [1, 2, 3, 4, 5]

C → [1, 2, 3, 4, 5]

D → [2, 2, 2, 2]

E → [1, 2, 8, 9]


## Casos Borde Considerados

Para validar la robustez del proyecto se probaron los siguientes casos borde:

Arreglo vacío
 Arreglo con un solo elemento
 Arreglo ya ordenado
 Arreglo en orden inverso
 Arreglo con duplicados
 Arreglo con valores repetidos y mezclados

Cada caso demuestra el comportamiento esperado de los algoritmos, especialmente su estabilidad y respuesta en el peor y mejor escenario.


## Autores
**Steven Jumbo**
* Github: [@SteveJ4ra](https://github.com/SteveJ4ra)


**Julian Vega**
* GitHub: [@Servio-Julian-Vega-Jimenez](https://github.com/ServioVega)

## Apóyanos

Dale una estrella al repositorio si te gustó el proyecto o te fue útil.
