import  java.util.Scanner;

public class aula2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite a placa do carro: ");
        String placaCarro = read.nextLine();

        System.out.println("Digite o ano do carro: ");
        int anoCarro = read.nextInt();

        if(anoCarro <= 2012)
            System.out.println("Carro velho!");
        else if(anoCarro <= 2021)
            System.out.println("Carro semi novo");
        else if (anoCarro == 2023)
            System.out.println("Carro novo!");
        else
            System.out.println("Ano não disponível, tente novamente");

        placaCarro = placaCarro.replace ('a', '*');
        placaCarro = placaCarro.replace ('e', '*');
        placaCarro = placaCarro.replace ('i', '*');
        placaCarro = placaCarro.replace ('o', '*');
        placaCarro = placaCarro.replace ('u', '*');

        placaCarro = placaCarro.replace ('A', '*');
        placaCarro = placaCarro.replace ('E', '*');
        placaCarro = placaCarro.replace ('I', '*');
        placaCarro = placaCarro.replace ('O', '*');
        placaCarro = placaCarro.replace ('U', '*');



        System.out.println("Placa do alterada: " + placaCarro);





    }


}
