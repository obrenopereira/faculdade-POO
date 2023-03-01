public class Banco {
    public static void main(String[] args) {
        ContaBancaria cli1;

        cli1 = new ContaBancaria("Alice","255484", "2565489");
        cli1.depositar(1000);
        cli1.sacar(500);
        System.out.println("Saldo: " + cli1.mostraSaldo());s


    }

}
