package bridge;

abstract class Veículo {
    protected Oficina primeiraOficina; 
    protected Oficina segundaOficina;
    
    protected Veículo(Oficina primeiraOficina, Oficina segundaOficina) { 
        this.primeiraOficina = primeiraOficina; 
        this.segundaOficina = segundaOficina; 
    } 
    
    abstract public void fabricar(); 
}