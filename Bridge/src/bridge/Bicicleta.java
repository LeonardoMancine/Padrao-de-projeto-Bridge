package bridge;

class Bicicleta extends Veículo {
    public Bicicleta(Oficina primeiraOficina, Oficina segundaOficina) {
        super(primeiraOficina, segundaOficina);
    }
    
    @Override
    public void fabricar() {
        System.out.print("Bicicleta ");
        primeiraOficina.trabalhar();
        segundaOficina.trabalhar();
    }
}