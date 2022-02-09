public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia,numero);
    }

    @Override
    public void saca(double valor) throws TransactionException{
        double valorASacar = valor + 0.03;
        super.saca(valorASacar);

    }

}
