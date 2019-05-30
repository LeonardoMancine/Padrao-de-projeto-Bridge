package bridge;

class Produzir implements Oficina {
    
    @Override
    public void trabalhar() {
        System.out.print("foi produzido(a)");
    }
}
