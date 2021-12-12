
package maratona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maratona {

    public static void main(String[] args) {
        int distancia_temp = 0;
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int u = n - 1;
        ArrayList<Integer> vetor1 = new ArrayList<Integer>();
        ArrayList<Integer> vetor2 = new ArrayList<Integer>();
        ArrayList<Integer> distancia_entre_maiores = new ArrayList<Integer>();
        
        for(int i = 0;i< n;i++){
             String numero = entrada.next();
             vetor1.add(Integer.parseInt(numero));
        
        }
        for(int i = 0;i< n;i++){
             String numero = entrada.next();
             vetor2.add(Integer.parseInt(numero));
        
        }
            
        Collections.sort(vetor1);
        Collections.sort(vetor2);
        for(int i = 0; i< n; i++){
            if(vetor1.get(u) > vetor2.get(u)){
                distancia_temp = vetor1.get(u) - vetor2.get(u);
               
            }else if(vetor1.get(u) < vetor2.get(u)){
            
                distancia_temp = vetor2.get(u) - vetor1.get(u);
            }else{
                distancia_temp = 0;
            }
            
            distancia_entre_maiores.add(distancia_temp);
            vetor1.remove(u);
            vetor2.remove(u);
            u = u - 1;
            
        
        }
        Collections.sort(distancia_entre_maiores);
        System.out.println(distancia_entre_maiores.get(n-1));
         
    }
}   

