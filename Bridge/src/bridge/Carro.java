package bridge;

class Carro extends Veículo {
    public Carro(Oficina primeiraOficina, Oficina segundaOficina) {
        super(primeiraOficina, segundaOficina);
    }
    
    @Override
    public void fabricar() {
        System.out.print("Carro ");
        primeiraOficina.trabalhar();
        segundaOficina.trabalhar();
    }
}
