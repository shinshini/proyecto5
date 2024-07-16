/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

import java.util.Scanner;
public class ej04_sumaDeVectore {
    public static void main(String [] args){
        Scanner lee=new Scanner(System.in);
        System.out.println("suma de los vectores en el  vector D ");
        System.out.print("intro tamaño del vector ");
        
        int n=lee.nextInt();
        
        int A[]=new int [n];
        int B[]=new int [n];
        int C[]=new int [n];
        int D[]=new int [n];
        
       llenarV(A,n);
       System.out.print("vector a:  ");
      mostrarV(A,n);
       llenarV(B,n);
       System.out.print("vector b:  ");
      mostrarV(B,n);
       llenarV(C,n);
       System.out.print("vector c:  ");
      mostrarV(C,n);
      
      sumarV(A,B,C,D,n);
      System.out.print(" vector D:  ");
      mostrarV(D,n);
      
    }
    public static void  llenarV(int V[],int n){
     Scanner lee= new Scanner(System.in);
     for(int i=0;i<n;i++){
     int num=(int)(Math.random()*100+1);
     V[i]=num;
     }
    }
    public static void mostrarV(int V[],int n){
    for(int i=0;i<n;i++){
    System.out.print("["+V[i]+"]");
    }
    System.out.println("");
    }
     public static void   sumarV(int A[],int B[],int C[],int D[],int n){
     for(int i=0;i<n;i++){
          D[i]=A[i]+B[i]+C[i];
     }
     }
}
