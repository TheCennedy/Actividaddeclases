/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;
import java.util.Scanner;
/**
 *
 * @author Karol Cobos
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
        System.out.println("-----------------Ejercicio 1 -------------");
        //double n1=1;
        //int i=1;
        //while(i<=120){
        //n1=n1*i;
         //i++;
        //}
        //System.out.println("El factorial del 1 al 102 es:"+ n1);
         System.out.println("-----------------Ejercicio 2 -------------");
     //    int n;
       //  int n1;
       //  int i=1;
       //  float medi;
       //  int suma=1;       
       //  System.out.println("ingrese la cantidad de numeros");
       //  n = sc.nextInt();
       // while(i<=n){
       //     System.out.println("ingrese el valor");
        //    n1 = sc.nextInt();
        //    suma=suma+n1;
        //    i++;
       // }
       // medi= suma/n;
          //System.out.println("la media de los numeros es: "+medi); 
          System.out.println("-----------------Ejercicio 3 -------------");
                  Scanner leer = new Scanner (System.in);
        int num [] = new int [3];
        System.out.println("Ingrese los numeros que va a sumar y sacar el promedio");
        int sum = 0; 
        for (int i = 0; i < 3; i++) {
            num[i] = leer.nextInt();
            sum = sum+ num[i];
            System.out.println("suma="+sum);
        }
        int mayor = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor) {
                mayor = num[i];
            }
            if (num[i]<menor) {
                menor = num[i];
            }
            
        }
        int distacia = mayor-menor;
        float promedio = sum/3;
        System.out.println("El promedio es: "+ promedio );
        System.out.println("El numero mayor es: " + mayor +" y el numero menor es: "+ menor );
        System.out.println("La distancia entre entre los numeros es: "+ distacia );
    }
    
}
