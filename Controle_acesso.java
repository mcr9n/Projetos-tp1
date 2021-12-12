
package controle_acesso;
import java.util.Scanner;
public class Controle_acesso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_homens = 0;
        int numero_mulheres = 0;
        char sexo = 'j';
        while(sexo != 'q'){
            String letra = entrada.nextLine();
            sexo = letra.charAt(0);
            if(sexo == 'h'){
                numero_homens += 1;
                
            }else if(sexo == 'm'){
                numero_mulheres += 1;
            
            }
        }
        System.out.println(numero_homens+" "+numero_mulheres);
        System.out.printf("%.2f %.2f %.2f\n", numero_homens*12.5, numero_mulheres*7.40,numero_homens*12.5 + numero_mulheres*7.40);
    }
}
