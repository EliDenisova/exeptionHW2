import java.util.Scanner;

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {

    public static void main(String[] args) {
        inputString();
    }

    private static void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        if (str.equals("")) {
            throw new RuntimeException("Пустую строку вводить нельзя");
        }
    }
}
