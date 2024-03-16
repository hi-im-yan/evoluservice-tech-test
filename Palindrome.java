public class Palindrome {
    //        2- Um palíndromo é uma palavra que pode ser lida da esquerda para a direita e vice-versa.
    //        Escreva uma função que verifica se a palavra dada é um palíndromo.
    //        Caracteres em caixa alta devem ser ignorados.
    //        Por exemplo, isPalindrome ("Deleveled") deve retornar True, já que é um palíndromo por ser possível ser lido nos dois sentidos.
    //        Utilize o esqueleto a seguir para implementar seu código: public boolean isPalindrome(String s) { // Seu código }
    public static void main(String[] args) {

        System.out.println(isPalindrome("Deleveled"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }

        return true;
    }
}
