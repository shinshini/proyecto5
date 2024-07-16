/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

import java.util.Scanner;
public class ejercicio02_posicionMayMen {
    public static void main(String [] args){
       Scanner lee= new Scanner(System.in);
       
       System.out.print("intro tamaño vector= ");
       
       int n=lee.nextInt();
       int A[]=new int [n];
       
       llenarV(A,n);
       mostrarV(A,n);
       
        int pm=mostrarPMen(A,n);
       int men=posicionMenor(A,n);
      
     System.out.println("el menor es "+men+" pocision ="+pm);
       int pM=mostrarPMay(A,n);
     int may=posicionMayor(A,n);
       
       System.out.println("el mayor es "+may+" pocision ="+pM);
    }
    public static void  llenarV(int A[],int n){
     Scanner lee= new Scanner(System.in);
     for(int i=0;i<n;i++){
     int num=lee.nextInt();
     A[i]=num;
     }
    }
    public static void mostrarV(int A[],int n){
    for(int i=0;i<n;i++){
    System.out.print("["+A[i]+"]");
    }
    System.out.println("");
    }
    public static int posicionMayor(int A[],int n){
    int may=-99999;
    
        for(int i=0;i<n;i++){
    if(A[i]>may){
        may=A[i];
     
    }
    }
    return (may);
    }
       public static int mostrarPMay(int A[],int n){
         int p=0;
         int may=-99999;
    for(int i=0;i<n;i++){
           if(A[i]>may){
        may=A[i];
       p=i;
    }
    
    }
    return (p); 
     }
     public static int posicionMenor(int A[],int n){
    int men=99999;
        for(int i=0;i<n;i++){
    if(A[i]<men){
        men=A[i];
    }
    }
    return(men);
    }
           public static int mostrarPMen(int A[],int n){
         int p=0;
         int men=99999;
    for(int i=0;i<n;i++){
         if(A[i]<men){
        men=A[i];
     p=i;
    }
    }
    return (p); 
     }
}
