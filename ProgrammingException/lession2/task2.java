package HomeWorkTasks.ProgrammingException.lession2;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        exception();

    }
    static public void exception(){
        try {
            int d = 0;
            int[] intArray = new int[10];
            for (int i = 0; i < intArray.length; i++ )
                intArray[i] = new Random().nextInt();
            double catchRes1 = intArray[8] / d;
            System.out.println("catchRes1 = " + catchRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
