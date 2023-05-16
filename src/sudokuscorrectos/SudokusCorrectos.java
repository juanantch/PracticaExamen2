/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudokuscorrectos;

import java.util.Scanner;

/**
 *
 * @author ciclos
 */
public class SudokusCorrectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCasos;
        int sudoku[][];
        int columnas;
        int filas;
        int filasSuBM;
        int columnasSubM;
        int subMatriz[][];
        int regiones;
        boolean sudokuCorrecto;

        sudoku = new int[9][9];
        subMatriz = new int[3][3];

        numCasos = sc.nextInt();

        for (int k = 0; k < numCasos; k++) {
            sudokuCorrecto = true;
            regiones = 0;
            columnas = 0;
            filas = 0;

            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku[i].length; j++) {
                    sudoku[i][j] = sc.nextInt();
                }
            }

            while (regiones < sudoku.length && sudokuCorrecto) {
                filasSuBM = 0;
                columnasSubM = 0;

                for (int i = filas; i < filas + 3; i++) {
                    for (int j = columnas; j < columnas + 3; j++) {
                        subMatriz[filasSuBM][columnasSubM] = sudoku[i][j];
                        columnasSubM++;
                    }
                    filasSuBM++;
                    columnasSubM = 0;
                }

                if (!esRegionSudokuCorrecta(subMatriz)) {
                    sudokuCorrecto = false;
                }

                regiones++;
                columnas += 3;

                if (columnas == sudoku.length) {
                    columnas = 0;
                    filas += 3;
                }

            }

            if (sudokuCorrecto) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }

    }
    
    /**
     * Compueba si la fila del sudoku es una fila correcta. 
     * Una fila es correcta cuando su longitud es de 9 números son números positivos que no se repiten.
     * 
     * @param filaSudoku un array que representa una fila de un sudoku
     * @return true si el array es válido, false en caso contrario
     * @throws NullPointerException si el array que recibe es un array nulo
     * @throws IllegalArgumentException si la longitud del array es distinta de 9
     */

    public static boolean esFilaSudokuCorrecta(int[] filaSudoku) throws NullPointerException {
        boolean filaValida = true;
        int i = 0;
        int cont;

        if (filaSudoku.length != 9) {
            throw new IllegalArgumentException();
        }

        while (i < filaSudoku.length && filaValida) {
            cont = i;

            if (filaSudoku[i] <= 0 || filaSudoku[i] > 9) {
                filaValida = false;
            }

            while (cont < filaSudoku.length - 1 && filaValida) {
                cont++;
                if (filaSudoku[i] == filaSudoku[cont]) {
                    filaValida = false;
                }
            }
            i++;
        }
        return filaValida;

    }
    
    /**
     * Extrae de una matriz la columna que le pasemos como parámetro
     * @param matriz la matriz de la cula queremos extraer la columna
     * @param numColumna la columna que queremos extraer de la matriz
     * @return el array que representa la columna de la matriz.
     * @throws NullPointerException 
     */

    public static int[] extraerColumnaDeMatriz(int[][] matriz, int numColumna) throws NullPointerException {
        int array[];
        array = new int[matriz.length];

        if (matriz.length == 0 || numColumna < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i].length <= numColumna || matriz[i].length == 0) {
                throw new IllegalArgumentException();
            }

            array[i] = matriz[i][numColumna];

        }

        return array;
    }
    
    /**
     * Comprueba si la matriz que representa un aregión de un sudoku es válida o no.
     * @param region la region del sudoku a comprobar si es válida
     * @return true si la matriz es válida, false en caso contrario
     * @throws NullPointerException si el array que recibe es un array nulo
     * @throws IllegalArgumentException si la longitud de alguna fila de la matriz es distinta de 3
     */

    public static boolean esRegionSudokuCorrecta(int[][] region) throws NullPointerException {
        boolean regionValida = true;
        int array[];
        int cont = 0;
        int i = 0;
        int j = 0;
        array = new int[9];

        if (region.length != 3) {
            throw new IllegalArgumentException();
        }

        while (i < region.length && regionValida) {

            if (region[i].length != 3) {
                throw new IllegalArgumentException();
            }

            while (j < region[i].length && regionValida) {

                array[cont] = region[i][j];
                cont++;
                j++;

            }
            j = 0;
            i++;

        }

        if (!esFilaSudokuCorrecta(array)) {
            regionValida = false;
        }

        return regionValida;

    }
}
