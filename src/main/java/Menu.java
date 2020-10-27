import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void setMenuAction(String menuAction) {
        this.menuAction = menuAction;
    }

    String menuAction;

    void showMenu() {
        //System.out.println("What you want to has to be done:");
        menuAction = scanner.nextLine();

        switch (menuAction) {
            case "new":
                System.out.println("---NEW RELEASES---");
                System.out.println("Mountains [Sia, Diplo, Labrinth]");
                System.out.println("Runaway [Lil Peep]");
                System.out.println("The Greatest Show [Panic! At The Disco]");
                System.out.println("All Out Life [Slipknot])");
                setMenuAction(menuAction);
                break;
            case "featured":
                System.out.println("---FEATURED---\n" +
                        "Mellow Morning\n" +
                        "Wake Up and Smell the Coffee\n" +
                        "Monday Motivation\n" +
                        "Songs to Sing in the Shower");
                setMenuAction(menuAction);
                break;
            case "categories":
                System.out.println("---CATEGORIES---\n" +
                        "Top Lists\n" +
                        "Pop\n" +
                        "Mood\n" +
                        "Latin");
                setMenuAction(menuAction);
                break;
            case "playlists Mood":
                System.out.println("---MOOD PLAYLISTS---\n" +
                        "Walk Like A Badass  \n" +
                        "Rage Beats  \n" +
                        "Arab Mood Booster  \n" +
                        "Sunday Stroll");
                setMenuAction(menuAction);
                break;
            case "exit":
                System.out.println("---GOODBYE!---");
                setMenuAction(menuAction);
                return;
        }

    }
}
