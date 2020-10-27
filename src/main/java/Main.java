import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        do {
            menu.showMenu();
        }while (!menu.menuAction.equals("exit"));
    }
}
