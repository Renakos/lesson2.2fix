package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя: ");
            String name = input.nextLine();
            try {
                user.setName(name);
                System.out.println("Введите возвраст: ");
                int age = input.nextInt();
                user.setAge(age);
            } catch (IllegalNameLengthException e) {
                e.printStackTrace();
            } catch (IllegalAgeException e) {
                e.printStackTrace();
            }
        }
    }
}
