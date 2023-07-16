package HomeWorkTasks.ProgrammingException.lession2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        inputFloat();


    }
    public static void inputFloat (){
        System.out.println("Введите дробное число: ");
        float number;
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextFloat();
            System.out.println(number);
        } catch (InputMismatchException e){
            inputFloat();
        }
    }
}
