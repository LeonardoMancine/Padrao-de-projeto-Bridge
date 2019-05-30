package bridge;

class Bridge {
    public static void main(String[] args) {
        
        Veículo primeiroVeículo = new Carro(new Produzir(), new Montar());
        primeiroVeículo.fabricar();
        
        Veículo segundoVeículo = new Bicicleta(new Produzir(), new Montar());
        segundoVeículo.fabricar();
    }
    
}