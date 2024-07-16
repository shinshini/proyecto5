/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;
import java.util.Scanner;
public class Ej07_llenarMitad0_1 {
    public static void main(String [] args){
    Scanner lee= new Scanner(System.in);
    System.out.print("intro tamaño del vector");
    int n=lee.nextInt();
    int A[]=new int [n];
    llenarV(A,n);
    mostrarV(A);
    
    } 
    public static void llenarV(int A[],int n){
        for(int i=0;i<n/2;i++){
            A[i]=0;
        }
        for(int i=n/2;i<n;i++){
          A[i]=1;
        }
        
    } 
        public static void mostrarV(int A[]){
    for(int i=0;i< A.length ;i++){
    System.out.print("["+A[i]+"]");
    }
    System.out.println("");
    }
}
