package metodos.metodo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio calculadora com os numeros 6, 3: ");
        Calculadora.soma(6,3);
        Calculadora.subtracao(6,3);
        Calculadora.multiplicacao(6,3);
        Calculadora.divisao(6,3);

        System.out.println("Exercicio mensagem com as horas 9, 14, 20: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
