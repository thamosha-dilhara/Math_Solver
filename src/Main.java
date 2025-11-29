import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(" __       __             __      __               ______             __                                      \n" +
                "|  \\     /  \\           |  \\    |  \\             /      \\           |  \\                                     \n" +
                "| $$\\   /  $$  ______  _| $$_   | $$____        |  $$$$$$\\  ______  | $$ __     __   ______    ______        \n" +
                "| $$$\\ /  $$$ |      \\|   $$ \\  | $$    \\       | $$___\\$$ /      \\ | $$|  \\   /  \\ /      \\  /      \\       \n" +
                "| $$$$\\  $$$$  \\$$$$$$\\\\$$$$$$  | $$$$$$$\\       \\$$    \\ |  $$$$$$\\| $$ \\$$\\ /  $$|  $$$$$$\\|  $$$$$$\\      \n" +
                "| $$\\$$ $$ $$ /      $$ | $$ __ | $$  | $$       _\\$$$$$$\\| $$  | $$| $$  \\$$\\  $$ | $$    $$| $$   \\$$      \n" +
                "| $$ \\$$$| $$|  $$$$$$$ | $$|  \\| $$  | $$      |  \\__| $$| $$__/ $$| $$   \\$$ $$  | $$$$$$$$| $$            \n" +
                "| $$  \\$ | $$ \\$$    $$  \\$$  $$| $$  | $$       \\$$    $$ \\$$    $$| $$    \\$$$    \\$$     \\| $$            \n" +
                " \\$$      \\$$  \\$$$$$$$   \\$$$$  \\$$   \\$$        \\$$$$$$   \\$$$$$$  \\$$     \\$      \\$$$$$$$ \\$$            \n" +
                "                                                                                                             \n" +
                "                                                                                                             \n" +
                "                                                                                                             ");

        System.out.println("[1] Quadric Equation ");
        System.out.println("[2] Area ");
        System.out.println("[3] Volume ");
        System.out.println("[4] Exit");

        System.out.print("Enter a number you going to solve: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

    }
}