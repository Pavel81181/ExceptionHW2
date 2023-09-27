public class Task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1,1,1,1,1,1,1,1,1};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    
}
