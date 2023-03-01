import java.sql.SQLOutput;
import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {
        int cont = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase = read.nextLine();

        for(int i = 0; i<frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U'  )
                cont++;
        }
        System.out.println("Total de vogais: " + cont);


    }
}
