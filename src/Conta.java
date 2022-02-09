public abstract class Conta {
    private double saldo;
    private int agencia;
    private int conta;
    private String nome;
    private int cpf;

    public Conta(int agencia, int conta){
        this.agencia = agencia;
        this.conta = conta;
        System.out.println("Conta criada: " + conta + " Agencia: " + agencia);
    }

    public void deposita (double valor) throws TransactionException{
        if (valor <= 0){
            throw new TransactionException("Valor de deposito inválido: " + valor);
        }
        this.saldo += valor;
    }
    public void saca (double valor) throws TransactionException{
        if (this.saldo < valor || valor <= 0){
            throw new TransactionException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(Conta c, double valor) throws TransactionException{
        this.saca(valor);
        c.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getConta(){
        return this.conta;
    }

    public int getAgencia(){
        return this.agencia;
    }
    public int setCpf(int cpf){
        return this.cpf = cpf;
    }
    public int getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

}
