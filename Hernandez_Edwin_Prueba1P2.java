/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_prueba1p2;

import java.util.Random;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Prueba1P2 {

    public static void main(String[] args) {
        Random random = new Random();

        int contador = 0;
        int contadorA = 0;
        int contadorCicloA;
        int contadorB = 0;
        int randomGenerado;

        String arregloA[] = new String[3];
        String arregloB[] = new String[3];

        String palabras[] = {"radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed"};
        int contadorPalabras = palabras.length;

        //Impresión del Arreglo Original
        while (contadorPalabras > 0) {
            System.out.println("[" + contador + "]: " + palabras[contador]);
            contadorPalabras--;
            contador++;
        }

        //Creación Arreglo A
        while (contadorA < 4) {
            
            contadorCicloA = 1;
            String palabra="";
            String palabraInvertida = "";

            do {
                randomGenerado = random.nextInt(0, 19);
                palabra = palabras[randomGenerado];
                contador = palabra.length() - 1;

                while (contador >= 0) {
                    char letra = palabra.charAt(contador);
                    palabraInvertida += letra;
                    contador--;
                    

                }
                
                contadorCicloA--;
                
            } while (contadorCicloA > 0);
            
            
            if (palabra.equals(palabraInvertida)) {
                    contadorA++;

                } 

        }
/*
        contador = 0;
        contadorPalabras = arregloA.length;

        while (contadorPalabras > 0) {
            System.out.println("[" + contador + "]: " + arregloA[contador]);
            contadorPalabras--;
            contador++;
        }*/

    }
}
