package stream.ex3;

public class Main {
    public static void main(String[] args) {

        // 1 Verifica se uma string não está vazia
        Validador<String> stringNaoVazia = texto -> texto != null && !texto.trim().isEmpty();

        // 2 Verifica se um número é positivo
        Validador<Integer> numeroPositivo = numero -> numero != null && numero > 0;

        // 3 Verifica se uma senha tem pelo menos 8 caracteres e contém um número
        Validador<String> senhaForte = senha -> senha != null
                && senha.length() >= 8
                && senha.matches(".*\\d.*");

        System.out.println("String 'Hello' não vazia? " + stringNaoVazia.validar("Hello"));
        System.out.println("String '   ' não vazia? " + stringNaoVazia.validar("   "));

        System.out.println("Número 10 é positivo? " + numeroPositivo.validar(10));
        System.out.println("Número -5 é positivo? " + numeroPositivo.validar(-5));

        System.out.println("Senha 'abc12345' é forte? " + senhaForte.validar("abc12345"));
        System.out.println("Senha 'abcdefg' é forte? " + senhaForte.validar("abcdefg"));
    }
}
