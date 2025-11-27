import java.util.Scanner;

public class esercizio{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("inserisci un  da affibiare alla variabile a: ");
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
    }

      
    
}