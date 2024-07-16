/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

import java.util.Scanner;
public class ej3_pocision_multiplo_ordenAsde {
    public static void main(String [] args){
    Scanner lee=new Scanner(System.in);
    System.out.print("intro tamanio del vector= ");
    
    int n=lee.nextInt();
    int A[]=new int [n];
    
    llenarV(A,n);
      mostrarV(A,n);
      
      multiploV(A,n);
      
      
      
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
    public static void multiploV(int A[],int n){
        Scanner lee=new Scanner(System.in);
        System.out.print("el multiplo es= ");
        int k=lee.nextInt();
        int s=0; int p=0; 
        for(int i=0;i<n;i++){
        if(A[i]%k==0){
         s=A[i];
           p=i;
           System.out.println(s+" posicion "+p);

        } 
        }
            
        
    }
  
}
