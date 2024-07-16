/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;
import java.util.Scanner;
public class Ej05_llenarCon_1_1_0_0_1_1 {
    public static void main(String [] args){
    Scanner lee=new Scanner(System.in);
    
    System.out.print("intro un tamaño ");
    int n=lee.nextInt();
    int A[]=new int [n];
     llenarV(A,n);
     mostrarV(A);
    
    }
    public static void  llenarV(int A[],int n){
      Scanner lee=new Scanner(System.in);
     int c=0;
     for(int i=0;i<n;i++){
     int x=lee.nextInt();
     if(x==1){
         if(c==0){
         c=c+1;
         A[i]=1;
         }
         else{
         c=0;
          A[i]=1;
         }
         
     }
     else{
         A[i]=0;
     }
     }
    }
    public static void mostrarV(int A[]){
    for(int i=0;i< A.length ;i++){
    System.out.print("["+A[i]+"]");
    }
    System.out.println("");
    }
}
