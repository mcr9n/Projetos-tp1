
package calcula_iptu;
import java.util.Scanner;
public class Calcula_iptu {

    public static void main(String[] args) {
        
        int tipo_loteamento, area_imovel;
        Scanner entrada = new Scanner(System.in);
        tipo_loteamento = entrada.nextInt();
        area_imovel = entrada.nextInt();
        if (tipo_loteamento == 1){
            if(area_imovel > 0 & area_imovel < 200){
                double iptu = area_imovel;
                System.out.printf("%.2f\n", iptu);
                    
            }else if(area_imovel >= 200){
                double iptu = area_imovel * 1.1;
                System.out.printf("%.2f\n", iptu);
        }else{
            System.out.print("Entrada inválida!");   
            }
        }else if(tipo_loteamento == 2){
            if(area_imovel > 0 & area_imovel < 200){
                double iptu = area_imovel * 1.2;
                System.out.printf("%.2f\n", iptu);
                    
            }else if(area_imovel >= 200){
                double iptu = area_imovel * 1.3;
                System.out.printf("%.2f\n", iptu);
        }else{
            System.out.print("Entrada inválida!");   
            }
        
        }else{
            System.out.print("Entrada inválida!");
        }
        
        
    }
    
}
