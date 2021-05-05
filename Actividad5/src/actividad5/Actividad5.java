/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;
import java.util.Scanner;
/**
 *
 * @author Karol Cobos
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("-----------------Ejercicio 1 -------------");
       // int n;
      //  String n1[]=new String[7];
       // n1[0]="Domigo";
       // n1[1]="Lunes";
       // n1[2]="Martes";
      // n1[3]="Miercoles";
      //  n1[4]="Jueves";
       // n1[5]="Viernes";
       //  n1[6]="Sabado";
       // for (int i = 0; i < 7; i++) {
         //   System.out.println(n1[i]);
       // }
        //Scanner sc = new Scanner (System.in);
        // System.out.println("Ingrese un valor del 1 al 7");
        // n = sc.nextInt();
        // if(n>=1 && n<=7){
           //  System.out.println(n1[n-1]); 
        // }else{
            // System.out.println("Ingrese un valor que esten en el rango de "
                 //    + "1 al 7 ");
        // }
        System.out.println("-----------------Ejercicio 2 -------------");
        //System.out.println("Matriz de personajes");
        //String sWar[][] = new String[3][4];
        //sWar[0][0]="Darth Vader";
       // sWar[0][1]="Luke Skywalker";
       // sWar[0][2]="Han solo";
        //sWar[0][3]="The Mandalorian";
        //sWar[1][0]="Obi-Wan Kenobi";
        //sWar[1][1]="Chewbacca";
       // sWar[1][2]="Yoda";
        //sWar[1][3]="Palpatine";
        //sWar[2][0]="R2-D2";
        //sWar[2][1]="C-3PO";
        //sWar[2][2]="Boba Fett";
        //sWar[2][3]="Kylo Ren";
       // int i,j;
        //for (i = 0;i < sWar.length; i++){
            //for(j = 0; j < sWar[i].length; j++){
               // System.out.print("["+sWar[i][j]+"]");
                
           // }    
       // }  
         System.out.println("-----------------Ejercicio 3 -------------");
         //System.out.println("Alfabeto y Morse");
         //String Alfabe[][] = new String[3][4];
         //Alfabe[0][0]="A: .-";
         //Alfabe[0][1]="B: -...";
        // Alfabe[0][2]="C: -.-.";
        // Alfabe[0][3]="D: -.."; 
         //Alfabe[0][4]="E: .";
         //Alfabe[1][0]="F: ..-."; 
         //Alfabe[1][1]="G: -.-."; 
        // Alfabe[1][2]="H: ...."; 
         //Alfabe[1][3]="I: ..";
         //Alfabe[1][4]="J: .---";
         //Alfabe[2][0]="K: -.-";
         //Alfabe[2][1]="L: .-..";
         //Alfabe[2][2]="M: --";
         //Alfabe[2][3]="N: -.";
         //Alfabe[2][4]="O: ----";
         //Alfabe[3][0]="P: .--.";
         //Alfabe[3][1]="Q: --.-";
         //Alfabe[3][1]="R: .-.";
         //Alfabe[3][2]="S: ...";
         //Alfabe[3][3]="T: -";
         //Alfabe[3][4]="U: ..-";
         //Alfabe[4][0]="V: ...-";
         //Alfabe[4][1]="W: .--";
         //Alfabe[4][2]="X: -..-";
         //Alfabe[4][3]="Y: -.--";
         //Alfabe[4][4]="Z: --..";
         System.out.println("-----------------Ejercicio 4 -------------");
  //       System.out.println("Ingrese una palabra sin espacios:");
   //     Scanner leer = new Scanner(System.in);
   //     String palabra = leer.next();
   //     char [] aChar = palabra.toCharArray();
   //     for (int i = 0; i < aChar.length; i++) {
  //          System.out.println(aChar[i]);
     //   }
         System.out.println("-----------------Ejercicio 5 -------------");
                 System.out.println("ingresa un sexo:");
        Scanner leer = new Scanner(System.in);
        String sWar[][] = new String[3][10];
        sWar[0][0]="Darth Vader";
        sWar[1][0]="2,03 m";
        sWar[2][0]="male";
        
        sWar[0][1]="Luke Skywalker";
        sWar[1][1]="1.72 m";
        sWar[2][1]="male";
        
        sWar[0][2]="Han solo";
        sWar[1][2]="1.8 m";
        sWar[2][2]="male";
        
        sWar[0][3]="Grogu";
        sWar[1][3]="0.42 m";
        sWar[2][3]="male";
        
        sWar[0][4]="Asoka Tano";
        sWar[1][4]="1.8 m";
        sWar[2][4]="female";
        
        sWar[0][5]="Rey Skywalker";
        sWar[1][5]="1.7 m";
        sWar[2][5]="female";
        
        sWar[0][6]="Jabba el Hutt";
        sWar[1][6]="3,9 m";
        sWar[2][6]="hermafrodita";
        
        sWar[0][7]="Zorba Desilijic";
        sWar[1][7]="3,03 m";
        sWar[2][7]="hermafrodita";
        
        sWar[0][8]="R2-D2";
        sWar[1][8]="2,03 m";
        sWar[2][8]="programming";
        
        sWar[0][9]="C-3PO";
        sWar[1][9]="2,03 m";
        sWar[2][9]="programming";
        String nameS = leer.next();
        switch(nameS){
            case "male": 
                for (int i = 0; i < 4; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "femele":
                for (int i = 4; i < 5; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "hermafrodita":
                for (int i = 5; i < 7; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            case "programming":
                for (int i = 7; i < 9; i++) {
                    System.out.println(sWar[0][i]);
                }
                break;
            
        }
        
        
    }
    

         
         
     
    }



       
    
    

