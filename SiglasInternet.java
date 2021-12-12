
package siglasinternet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
public class SiglasInternet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"ISO-8859-1");
        int numero_siglas = scanner.nextInt();
        String[] siglas = new String[numero_siglas];
        Map<String, String> map = new HashMap<String, String>();
        scanner.nextLine();
        for(int i = 0; i < numero_siglas;i++){
            String sigla = scanner.next();
            String palavra = scanner.next();
            map.put(sigla, palavra);
            siglas[i] = sigla;
        }
        scanner.nextLine();
        String frase = scanner.nextLine();
        String[] vetor_palavras = frase.split(" ");
        for(int i = 0; i < vetor_palavras.length; i++){
            for(String sigla : siglas){
                if(vetor_palavras[i].toLowerCase().equals(sigla)){
                     vetor_palavras[i] = map.get(sigla);
                    
                }
            
            }
        
    }
    for(int j = 0; j < vetor_palavras.length;j++){
        if(j == (vetor_palavras.length - 1)){
        System.out.println(vetor_palavras[j]);
        }else{
        System.out.print(vetor_palavras[j] + " ");
        }
    }
}
}