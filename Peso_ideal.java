
package peso_ideal;
import java.util.Scanner;
public class Peso_ideal {

    public static void main(String[] args) {
        double altura, peso_ideal;
        char[] sexos_aceitos = {'m','f'};
        String sexo;
        int foi = 0;
        Scanner entrada = new Scanner(System.in);
        altura = Double.parseDouble(entrada.nextLine());
        sexo = entrada.nextLine();

        if(altura >= 0){
            for(int i = 0; i < 2; i++){
                char letra = sexo.charAt(0);
                if(sexos_aceitos[i] == letra){
                    if(letra == 'm'){
                        peso_ideal = (72.7 * altura) - 58;
                        System.out.printf("%.1f kg\n", peso_ideal);
                        foi = 1;
                    }else{
                        peso_ideal = (62.1 * altura) - 44.7;
                        System.out.printf("%.1f kg\n", peso_ideal);
                        foi = 1;
                    }
                
                }
                
            }
            if(foi == 1){}else{
                System.out.print("Entrada inválida!");
            }
            }else{
            System.out.print("Entrada inválida!");
        }
            
        }
        
        
    }
