class ContaBancaria {
    private int saldo = 1000;

    public synchronized void sacar(int valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(Thread.currentThread().getName() + " sacou: " + valor + ". Saldo atual: " + saldo);
        } else {
            System.out.println(Thread.currentThread().getName() + " tentou sacar: " + valor + ", mas saldo insuficiente.");
        }
    }

    public synchronized void depositar(int valor) {
        saldo += valor;
        System.out.println(Thread.currentThread().getName() + " depositou: " + valor + ". Saldo atual: " + saldo);
    }

    public int getSaldo() {
        return saldo;
    }
}