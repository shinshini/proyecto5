/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;
import java.util.Scanner;
public class Ej09_InvertirCadena {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = sc.nextLine();
        
        char[] vectorCaracteres = cadena.toCharArray();
        invertirPalabras(vectorCaracteres);
        
        System.out.println("Palabras invertidas:");
        for (char c : vectorCaracteres) {
            System.out.print(c);
        }
    }
    
    public static void invertirPalabras(char[] vectorCaracteres) {
        int inicio = 0;
        for (int i = 0; i < vectorCaracteres.length; i++) {
            if (vectorCaracteres[i] == ' ' || i == vectorCaracteres.length - 1) {
                if (i == vectorCaracteres.length - 1) {
                    reverse(vectorCaracteres, inicio, i);
                } else {
                    reverse(vectorCaracteres, inicio, i - 1);
                }
                inicio = i + 1;
            }
        }
        
        reverse(vectorCaracteres, 0, vectorCaracteres.length - 1);
    }
    
    public static void reverse(char[] vectorCaracteres, int inicio, int fin) {
        while (inicio < fin) {
            char temp = vectorCaracteres[inicio];
            vectorCaracteres[inicio] = vectorCaracteres[fin];
            vectorCaracteres[fin] = temp;
            inicio++;
            fin--;
        }
    }
    
}
