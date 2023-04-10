import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
         double raio;
        double area;

       System.out.println("Escreva o valor do raio: ");
       Scanner teclado= new Scanner(System.in);
       raio = teclado.nextFloat();
      
       area  = (raio * raio);

       System.out.println("O valor da area é " + area);  
       
       teclado.close();
    }
}





