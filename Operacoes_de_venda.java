
package operacoes_de_venda;
import java.util.Scanner;
public class Operacoes_de_venda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int p = 0;
        int l = 0;
        int u = 0;
        int h = 0;
        int k = 1;
        int numero_produtos;
        numero_produtos = entrada.nextInt();
        entrada.nextLine();
        String[] array_geral = new String[2 * numero_produtos];
        String[] array;
        array = new String[2];
        for(int i = 0; i < numero_produtos; i++){
            String produto = entrada.nextLine();
            array = produto.split(" ");
            array_geral[h] = array[0];
            try{
            array_geral[k] = array[1];
            }catch(Exception e){
            array_geral[k] = "";
            continue;
            }
            h += 2;
            k += 2;
        }
        String o_que_quer = String.valueOf(entrada.nextLine());
        String fim = "fim";
        while (!o_que_quer.equals(fim)){ 
            p = 0;
            u = 0;
            for(int i = 0; i < array_geral.length; i ++){
                if(u == 1)
                    break;
                if(array_geral[i].equals(o_que_quer)){
                    
                    u = 1;
                    int quanto_quieres = entrada.nextInt();
                    System.out.println(o_que_quer + " " + quanto_quieres);
                    int quanto_sobra = Integer.parseInt(array_geral[i + 1]) - quanto_quieres;
                    String toma = String.valueOf(quanto_sobra);
                    array_geral[i+1] = toma;
                    }
                    if(i == array_geral.length - 1 & u == 0){
                        System.out.println(o_que_quer + " produto não encontrado");
                        p = 1;
                    }
                }
        if (p == 0){
        entrada.nextLine();
        }
        o_que_quer = String.valueOf(entrada.nextLine());
        
        } 

        for(int j = 0; j < array_geral.length; j+=2){
        System.out.println(array_geral[j]+" "+array_geral[j+1]);
        }
    }
}


