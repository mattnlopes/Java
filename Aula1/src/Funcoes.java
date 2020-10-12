public class Funcoes {

    private void helloWorld(){
        System.out.println("Olá, mundo!");
    }

    private long soma (long a, long b){
        return a+b;
    }

    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        funcoes.helloWorld();

        System.out.println(funcoes.soma(2, 6));
    }
}
