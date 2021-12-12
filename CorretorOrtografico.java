
package corretorortografico;
import java.util.Scanner;
public class CorretorOrtografico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"ISO-8859-1");
        int numero_erros = 0;
        int l = 0;
        int u = 0;
        int numero_entradas = entrada.nextInt();
        entrada.nextLine();
        String[]vetor = new String[numero_entradas];
        for(int i = 0;i < vetor.length;i++){
            String palavra = entrada.nextLine();
            vetor[i] = palavra;
        }
        String palavra_errada = entrada.nextLine();
        for(int i = 0; i < vetor.length;i++){
            if(palavra_errada.equals(vetor[i])){
                System.out.println("palavra correta");
                u = 1;
            }else if(i == (vetor.length - 1) && u == 0){
                System.out.println("palavra incorreta");
            
            }
            
        
        }
        if(u == 0){
        for(String palavra : vetor){
            numero_erros = 0;
            if(palavra.length()>1){
            for(int j = 0;j<palavra.length();j++){
                
                if(palavra_errada.charAt(j) != palavra.charAt(j)){
                    if(numero_erros == 0){
                    numero_erros += 1;
             
                    
                    }else if(numero_erros == 1){
                    String antiga_palavra_errada = palavra_errada;
                    char k = palavra_errada.charAt(j-1);
                    char p = palavra_errada.charAt(j);
                    String[]vetor1 = new String[palavra_errada.length()];
                    vetor1 = palavra_errada.split("");
                    vetor1[j] = String.valueOf(k);
                    vetor1[j-1] = String.valueOf(p);
                    palavra_errada = "";
                    for(String elemento : vetor1){
                        palavra_errada += elemento;
                    }
                    if(palavra_errada.equals(palavra)){
                        System.out.println(palavra + "?");
                        l = 1;
                        palavra_errada = antiga_palavra_errada;
                        numero_erros = 0;
                        break;
                    }else{
                    palavra_errada = antiga_palavra_errada;
                    numero_erros = 0;
                    break;
                    }
                    }
                
                }
            
            }
            }
        }if(l == 0){
        
            System.out.println("nenhuma sugestão");
        }
    }
    }
}
