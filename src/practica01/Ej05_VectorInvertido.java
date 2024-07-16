/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;
import java.util.Scanner;
public class Ej05_VectorInvertido {
    public static void main(String [] args){
    Scanner lee=new Scanner (System.in);
    
    System.out.print("intro tamaño del vector");
    
    int n=lee.nextInt();
    int A[]=new int[n];
     llenarV(A,n);
      mostrarV(A,n);
      invertirV(A,n);
      System.out.println("invertido el vector");
      mostrarV(A,n);
    }
    public static void  llenarV(int V[],int n){
     Scanner lee= new Scanner(System.in);
     System.out.println("introdusca el numero ");
     for(int i=0;i<n;i++){
     int num=lee.nextInt();
     V[i]=num;
     }
    }
    public static void mostrarV(int V[],int n){
    for(int i=0;i<n;i++){
    System.out.print("["+V[i]+"]");
    }
    System.out.println("");
    }
    public static void invertirV(int A[],int n){
    for(int i=0;i<n/2;i++){
    int temp=A[i];
    A[i]=A[n-1-i];
    A[n-1-i]=temp;
    }
    }
}
