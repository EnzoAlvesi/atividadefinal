package applicationareatrapezio;

import java.util.Scanner;

public class ApplicationAreaTrapezio {

    public static void main(String[] args) {
     
        Scanner ler = new Scanner (System.in);
        double baseMaior, baseMenor, altura, area;
        
        
        System.out.println("Digite o valor da base maior.");
        baseMaior = ler.nextDouble();
        
         System.out.println("Digite o valor da base menor.");
        baseMenor = ler.nextDouble(); 
        
        System.out.println("Digite o valor da base altura.");
        altura = ler.nextDouble();
        
        area = (baseMaior + baseMenor) * altura / 2.0;
        
        System.out.printf("Área = %.2f %n", area); //%.2f = número de casas decimais
        
        ler.close();
        
    }
    
}
