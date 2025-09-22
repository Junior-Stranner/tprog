package stream.ex2;

public class Main {
    public static void main(String[] args) {
        // Lambda para exibir a mensagem formatada
        Mensagem mensagemFormatada = System.out::println;

        mensagemFormatada.exibir("Olá, Mundo!");
        mensagemFormatada.exibir("Java com Lambda é demais!");
    }
}
