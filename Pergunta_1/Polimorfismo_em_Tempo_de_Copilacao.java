class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}

public class Polimorfismo_em_Tempo_de_Copilacao {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(5, 5));
        System.out.println(calc.somar(5.5, 5.5));
    }
}