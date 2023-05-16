/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sudokuscorrectos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ciclos
 */
public class SudokusCorrectosTest {
    
    public SudokusCorrectosTest() {
    }

    /**
     * Test of esFilaSudokuCorrecta method, of class SudokusCorrectos.
     */
    @Test(expected = NullPointerException.class)
    public void testEsFilaSudokuCorrecta_1() {
        System.out.println("esFilaSudokuCorrecta - Vector nulo");
        int[] filaSudoku = null;

        SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsFilaSudokuCorrecta_2() {
        System.out.println("esFilaSudokuCorrecta - Vector vacío");
        int[] filaSudoku = {};

        SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku);
    }

    @Test
    public void testEsFilaSudokuCorrecta_3a() {
        System.out.println("esFilaSudokuCorrecta - Fila Sudoku correcta - orden ascendente");
        int[] filaSudoku = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertTrue(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_3b() {
        System.out.println("esFilaSudokuCorrecta - Fila Sudoku correcta - orden descendente");
        int[] filaSudoku = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertTrue(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_3c() {
        System.out.println("esFilaSudokuCorrecta - Fila Sudoku correcta - desordenado");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 3, 6};

        assertTrue(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_4() {
        System.out.println("esFilaSudokuCorrecta - Contiene numeros fuera de rango - al principio");
        int[] filaSudoku = {10, 4, 8, 1, 5, 9, 7, 3, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_5() {
        System.out.println("esFilaSudokuCorrecta - Contiene numeros fuera de rango - en medio");
        int[] filaSudoku = {2, 4, 8, 1, 10, 9, 7, 3, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_6() {
        System.out.println("esFilaSudokuCorrecta - Contiene numeros fuera de rango - final");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 3, 10};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_7() {
        System.out.println("esFilaSudokuCorrecta - Contiene numeros fuera de rango - al principio");
        int[] filaSudoku = {0, 4, 8, 1, 5, 9, 7, 3, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_8() {
        System.out.println("esFilaSudokuCorrecta - Contiene numeros fuera de rango - en medio");
        int[] filaSudoku = {2, 4, 8, 1, 0, 9, 7, 3, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_9() {
        System.out.println("esFilaSudokuCorrecta - Contiene numeros fuera de rango - final");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 3, 0};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_10() {
        System.out.println("esFilaSudokuCorrecta - Numeros repetidos al principio");
        int[] filaSudoku = {2, 2, 8, 1, 5, 9, 7, 3, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_11() {
        System.out.println("esFilaSudokuCorrecta - Numeros repetidos por en medio");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 8, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test
    public void testEsFilaSudokuCorrecta_12() {
        System.out.println("esFilaSudokuCorrecta - Numeros repetidos al final");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 6, 6};

        assertFalse(SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsFilaSudokuCorrecta_13() {
        System.out.println("esFilaSudokuCorrecta - Tiene tamanyo mayor de nueve - Hay un repetido");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 3, 6, 1};

        SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsFilaSudokuCorrecta_14() {
        System.out.println("esFilaSudokuCorrecta - Tiene tamanyo mayor de nueve - Hay numero fuera de rango");
        int[] filaSudoku = {2, 4, 8, 1, 5, 9, 7, 3, 6, 15};

        SudokusCorrectos.esFilaSudokuCorrecta(filaSudoku);
    }

    /**
     * Test of extraerColumnaDeMatriz method, of class SudokusCorrectos.
     */
    @Test(expected = NullPointerException.class)
    public void testExtraerColumnaDeMatriz_1() {
        System.out.println("extraerColumnaDeMatriz - Matriz nula");
        int[][] matriz = null;
        int numColumna = 0;
        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_2() {
        System.out.println("extraerColumnaDeMatriz - Matriz vacia - sin filas");
        int[][] matriz = {};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_3a() {
        System.out.println("extraerColumnaDeMatriz - Matriz vacia - sin columnas");
        int[][] matriz = {{}};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_3b() {
        System.out.println("extraerColumnaDeMatriz - Matriz vacia - sin columnas");
        int[][] matriz = {{}, {}};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_3c() {
        System.out.println("extraerColumnaDeMatriz - Matriz vacia - sin columnas");
        int[][] matriz = {{}, {}, {}};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_4a() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional con alguna fila vacia - en medio");
        int[][] matriz = {{1, 2}, {}, {3, 4}};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_4b() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional con alguna fila vacia - primera");
        int[][] matriz = {{}, {1, 2}, {3, 4}};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_4c() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional con alguna fila vacia - ultima");
        int[][] matriz = {{1, 2}, {3, 4}, {}};
        int numColumna = 0;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_5a() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional con alguna fila sin la columna pedida - en medio");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10}};
        int numColumna = 2;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_5b() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional con alguna fila sin la columna pedida - primera");
        int[][] matriz = {{5, 6}, {1, 2, 3, 4}, {7, 8, 9, 10}};
        int numColumna = 2;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_5c() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional con alguna fila sin la columna pedida - ultima");
        int[][] matriz = {{1, 2, 3, 4}, {7, 8, 9, 10}, {5, 6}};
        int numColumna = 2;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test
    public void testExtraerColumnaDeMatriz_6a() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional donde existe la columna pedida");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10}};
        int numColumna = 1;
        int[] expResult = {2, 6, 8};

        int[] result = SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testExtraerColumnaDeMatriz_7b() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional donde existe la columna pedida");
        int[][] matriz = {{5, 6}, {1, 2, 3, 4}, {7, 8, 9, 10}};
        int numColumna = 1;
        int[] expResult = {6, 2, 8};

        int[] result = SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testExtraerColumnaDeMatriz_7c() {
        System.out.println("extraerColumnaDeMatriz - Array bidimensional donde existe la columna pedida");
        int[][] matriz = {{1, 2, 3, 4}, {7, 8, 9, 10}, {5, 6}};
        int numColumna = 1;
        int[] expResult = {2, 8, 6};

        int[] result = SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
        assertArrayEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_8a() {
        System.out.println("extraerColumnaDeMatriz - Columna no existe - es negativa");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int numColumna = -1;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExtraerColumnaDeMatriz_8b() {
        System.out.println("extraerColumnaDeMatriz - Columna no existe - es superior");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int numColumna = 4;

        SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
    }

    @Test
    public void testExtraerColumnaDeMatriz_9a() {
        System.out.println("extraerColumnaDeMatriz - Extraer primera columna");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int numColumna = 0;
        int[] expResult = {1, 5, 9};

        int[] result = SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testExtraerColumnaDeMatriz_9b() {
        System.out.println("extraerColumnaDeMatriz - Extraer columna en medio");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int numColumna = 2;
        int[] expResult = {3, 7, 11};

        int[] result = SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testExtraerColumnaDeMatriz_9c() {
        System.out.println("extraerColumnaDeMatriz - Extraer ultima columna");
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int numColumna = 3;
        int[] expResult = {4, 8, 12};

        int[] result = SudokusCorrectos.extraerColumnaDeMatriz(matriz, numColumna);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of esRegionSudokuCorrecta method, of class SudokusCorrectos.
     */
    @Test(expected = NullPointerException.class)
    public void testEsRegionSudokuCorrecta_1() {
        System.out.println("esRegionSudokuCorrecta - Matriz nula");
        int[][] region = null;

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_2() {
        System.out.println("esRegionSudokuCorrecta - Matriz vacia - sin filas");
        int[][] region = {};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_3a() {
        System.out.println("esRegionSudokuCorrecta - Matriz vacia - sin columnas");
        int[][] region = {{}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_3b() {
        System.out.println("esRegionSudokuCorrecta - Matriz vacia - sin columnas");
        int[][] region = {{}, {}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_3c() {
        System.out.println("esRegionSudokuCorrecta - Matriz vacia - sin columnas");
        int[][] region = {{}, {}, {}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test
    public void testEsRegionSudokuCorrecta_4a() {
        System.out.println("esRegionSudokuCorrecta - ordenado ascendente");
        int[][] region = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        assertTrue(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_4b() {
        System.out.println("esRegionSudokuCorrecta - ordenado descendente");
        int[][] region = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        assertTrue(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_4c() {
        System.out.println("esRegionSudokuCorrecta - sin orden");
        int[][] region = {{9, 1, 5}, {2, 7, 4}, {3, 6, 8}};

        assertTrue(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_5a() {
        System.out.println("esRegionSudokuCorrecta - Contiene numeros fuera de rango - al principio");
        int[][] region = {{10, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_5b() {
        System.out.println("esRegionSudokuCorrecta - Contiene numeros fuera de rango - en medio");
        int[][] region = {{1, 2, 3}, {4, 10, 6}, {7, 8, 9}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_5c() {
        System.out.println("esRegionSudokuCorrecta - Contiene numeros fuera de rango - al final");
        int[][] region = {{1, 2, 3}, {4, 5, 6}, {7, 8, 10}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_5d() {
        System.out.println("esRegionSudokuCorrecta - Contiene numeros fuera de rango - al principio");
        int[][] region = {{0, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_5e() {
        System.out.println("esRegionSudokuCorrecta - Contiene numeros fuera de rango - en medio");
        int[][] region = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_5f() {
        System.out.println("esRegionSudokuCorrecta - Contiene numeros fuera de rango - al final");
        int[][] region = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_6a() {
        System.out.println("esRegionSudokuCorrecta - Numeros repetidos al principio");
        int[][] region = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_6b() {
        System.out.println("esRegionSudokuCorrecta - Numeros repetidos por en medio");
        int[][] region = {{1, 2, 3}, {4, 5, 2}, {7, 8, 9}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test
    public void testEsRegionSudokuCorrecta_6c() {
        System.out.println("esRegionSudokuCorrecta - Numeros repetidos al final");
        int[][] region = {{1, 2, 3}, {4, 5, 6}, {7, 8, 8}};

        assertFalse(SudokusCorrectos.esRegionSudokuCorrecta(region));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_7a() {
        System.out.println("esRegionSudokuCorrecta - Region mal formada - Falta una fila");
        int[][] region = {{1, 2, 3}, {4, 5, 6}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_7b() {
        System.out.println("esRegionSudokuCorrecta - Region mal formada - Ultima final de un elemento menos");
        int[][] region = {{1, 2, 3}, {4, 5, 6}, {7, 8}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_7c() {
        System.out.println("esRegionSudokuCorrecta - Region mal formada - Primera fila de un elemento menos");
        int[][] region = {{1, 2}, {4, 5, 6}, {7, 8, 9}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_7d() {
        System.out.println("esRegionSudokuCorrecta - Region mal formada - Fila de en medio de un elemento menos");
        int[][] region = {{1, 2, 3}, {5, 6}, {7, 8, 9}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_7e() {
        System.out.println("esRegionSudokuCorrecta - Region mal formada - Dimensiones mayores");
        int[][] region = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsRegionSudokuCorrecta_7f() {
        System.out.println("esRegionSudokuCorrecta - Region mal formada - Dimensiones mayores");
        int[][] region = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {12, 13, 14}};

        SudokusCorrectos.esRegionSudokuCorrecta(region);
    }
    
}
