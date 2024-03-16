public class TicoTeco {

//    1- Escreva um programa que imprima os números de 1 a 100.
//    Mas para múltiplos de três imprima 'Tico' em vez do número e para os múltiplos de cinco imprima 'Teco'.
//    Para números que são múltiplos de três e cinco imprimir 'TicoTeco'.
//    Exemplo, para o caso de 1 a 5, o programa nos daria '1, 2, Tico, 4, Teco'.
//    Utilize o esqueleto a seguir para implementar seu código: public void ticoTeco() { // Seu código }
    public static void main(String[] args) {
        ticoTeco();
    }

    public static void ticoTeco() {
        for (int i = 1; i <= 100; i++) {
            if (isMultipleOf3(i) && isMultipleOf5(i)) {
                System.out.println("TicoTeco");
            } else if (isMultipleOf3(i)) {
                System.out.println("Tico");
            } else if (isMultipleOf5(i)) {
                System.out.println("Teco");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private static boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}
