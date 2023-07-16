package HomeWorkTasks.ProgrammingException.lession2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        doNotEnterAnEmptyLine();
    }

    public static void doNotEnterAnEmptyLine() {
        Scanner scanner = new Scanner(System.in);
        String stringLine = scanner.nextLine();
        if (stringLine.isEmpty()) throw new IllegalArgumentException("Строка пустая!");
        else System.out.println(stringLine);
    }
}
