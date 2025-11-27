import java.util.Scanner;
import java.util.Arrays;

public class esercizio{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        
/*      System.out.println("inserisci un  da affibiare alla variabile a: ");
        int a = scan.nextInt();

        System.out.println("inserisci un  da affibiare alla variabile b: ");
        int b = scan.nextInt();

        System.out.println("inserisci un  da affibiare alla variabile c: ");
        int c = scan.nextInt();

       float media = (a + b + c) / 3;

       System.out.println("la media è: " + media);
 
       if(a > b && a > c){
            System.out.println("il valore maggiore è a");
            if(b < c){
                System.out.println("il valore minore è b");
            }
            else{
                System.out.println("il valore minore è c");
            }
       }
       else if(b > a && b > c){
            System.out.println("il valore maggiore è b");
            if(a < c){
                System.out.println("il valore minore è a");
            }
            else{
                System.out.println("il valore minore è c");
            }
       }
       else{
            System.out.println("il valore maggiore è c");
            if(a < b){
                System.out.println("il valore minore è a");
            }
            else{
                System.out.println("il valore minore è b");
            }
       }          
*/
        int max = 0; 
        int min = 0;
        int[] j = new int[3];  
        int media = 0;
        for(int i=0;i<3;i++){
            System.out.println("inserisci un numero: ");
            
            j[i] = scan.nextInt();

            media += j[i];
         
            if(i==0){
                max = j[i];
                min = j[i];
            }
            else{
                if(j[i] > max){
                max = j[i];
                }
                if(j[i] < min){
                min = j[i];
                }
            }

            
        }
        
        System.out.println("la media è: " + ((float)media/3));
        System.out.println("il numero maggiore è: " + max) ;
        System.out.println("il numero minore è: " + min );


    }

      
    
}