/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;
import java.util.Scanner;
public class Ej08_pagar_recibircambio_monedasconsideradas {
    public static void main(String []args){
        Scanner lee= new Scanner(System.in);
        //pedir precio
        System.out.print("ingrese el precio del producto: ");
        double precio=lee.nextDouble();
        //pedir dinero pagado
        System.out.print("ingrese el dinero pagado: ");
        double dineroPagado =lee.nextDouble();
        
        double cambio=calcularCambio(precio,dineroPagado);
        System.out.println("el cambio a devolver es de: "+cambio+" Bs");
        
        calcularMonedas(cambio);
    }
    public static double calcularCambio(double precio,double dineroPagado){
    return (dineroPagado-precio);
    }
    public static void calcularMonedas(double cambio){
        Scanner lee= new Scanner(System.in);
        System.out.println("vuelto de cambio respectivas moneedas");
        int monedas[]=new int[6];
        double [] valores={5, 2, 1, 0.50, 0.20, 0.10};
        for(int i=0;i<monedas.length;i++){
            if(cambio >= valores[i]){
            monedas[i]=(int)(cambio/ valores[i]);
            cambio = cambio % valores[i];
            }
        }
        System.out.println("Debe devolver:");
        System.out.println(monedas[0] + " monedas de 5 Bs");
        System.out.println(monedas[1] + " monedas de 2 Bs");
        System.out.println(monedas[2] + " monedas de 1 Bs");
        System.out.println(monedas[3] + " monedas de 0.50 Bs");
        System.out.println(monedas[4] + " monedas de 0.20 Bs");
        System.out.println(monedas[5] + " monedas de 0.10 Bs");
    }
    
}
