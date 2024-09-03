public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        Pessoa p1 = new Pessoa(conta);
        Pessoa p2 = new Pessoa(conta);

        try {
            p1.getThread().join();
            p2.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}