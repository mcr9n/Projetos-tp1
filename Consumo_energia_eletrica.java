
package consumo_energia_eletrica;
import java.util.Scanner;
public class Consumo_energia_eletrica {

    public static void main(String[] args) {
        double consumo;
        Scanner entrada = new Scanner(System.in);
        consumo = Double.parseDouble(entrada.nextLine());
        if(consumo<=500){
            double tarifa = consumo * 0.02;
            double total = tarifa + 5;
            System.out.printf("%.2f 5.00 %.2f",tarifa,total);
        }else if(consumo > 500 & consumo <= 1000){
            double tarifa = (500 * 0.10) + (consumo - 500)*0.05;
            double total = tarifa + 5;
            System.out.printf("%.2f 5.00 %.2f",tarifa,total);
        
        }else{
            double tarifa = (1000 * 0.35) + (consumo - 1000)*0.10;
            double total = tarifa + 5;
            System.out.printf("%.2f 5.00 %.2f",tarifa,total);
            
        }
    }
    
}
