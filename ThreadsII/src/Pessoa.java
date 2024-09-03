class Pessoa implements Runnable {
    private Thread thread;
    private ContaBancaria contaBancaria;

    public Pessoa(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contaBancaria.sacar(200);
            contaBancaria.depositar(200);
        }
    }

    public Thread getThread() {
        return thread;
    }
}