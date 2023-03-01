public class ContaBancaria {
    private String nome;
    private String agencia;
    private String numCOnta;
    private double saldoBancario;

    public ContaBancaria(String nome, String agencia, String numCOnta) {
        this.nome = nome;
        this.agencia = agencia;
        this.numCOnta = numCOnta;
    }

    public void depositar(double valor){
        saldoBancario = saldoBancario + valor;
    }

    public void sacar(double valor){
        if(valor <= saldoBancario)
            saldoBancario = saldoBancario - valor;
    }
    public double mostraSaldo(){
        return saldoBancario;
    }
}
