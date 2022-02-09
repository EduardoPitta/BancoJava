public class ContaTeste {

    public static void main(String[] args){

        ContaCorrente conta = new ContaCorrente(1231,98472);
        try{
            conta.deposita(100);
            conta.saca(-10);
        }
        catch (TransactionException ex){
            System.out.println("Alguma coisa deu errado...");
        }

    }
}
