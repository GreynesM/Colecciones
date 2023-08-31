package ejercicio010array;

import java.text.DecimalFormat;
import java.util.Arrays;




public class Ejercicio010Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.0");
        double [] arregloA = new double[50];
         double [] arregloB = new double[20];
         
        
          System.out.println("---------VALORES DEL ARREGLO A----------");
         for (int i = 0; i < 50; i++) {
             arregloA[i]= Math.random() * 100;
             System.out.println(df.format(arregloA[i]));
            
        }
         
         System.out.println("");
         Arrays.sort(arregloA);
         
         System.out.println("------------VALORES DESCENDENTES DEL ARREGLO A------------");
        for (int i = 0; i < 50; i++) {
             System.out.println(df.format(arregloA[i]));

          
        }
       for (int i = 0; i < 10; i++) {
           arregloB[i]=arregloA[i];
            
        }
         
       
      Arrays.fill(arregloB,10,arregloB.length,0.5);
           System.out.println("-----------ARREGLO COMBINADO-----------------");
           for (int i = 0; i < 20; i++) {
               System.out.print("["+df.format(arregloB[i])+"]");
        }
           
           //System.out.println(Arrays.toString(arregloB));
        }
    }
            


        
    


