//Если необходимо, исправьте код:
public class Task2 {
    public static void main(String[] args) {
        correctCode2();
    }

    private static void correctCode2() {
        int[] intArray = {1, 2, 3, 5, 79, 6, 54, 29, 77};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}