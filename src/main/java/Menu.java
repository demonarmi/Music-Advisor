import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String redirect_uri = "https://developer.spotify.com/dashboard/applications/a971a6d5c303423093ec224bc657ea22";
    boolean auth;

    public void setMenuAction(String menuAction) {
        this.menuAction = menuAction;
    }

    String menuAction;

    boolean authorization(){
        auth = true;
        return true;
    }

    void showMenu() {
        menuAction = scanner.nextLine();

        switch (menuAction) {
            case "new":
                if(auth == true) {
                    System.out.println("---NEW RELEASES---");
                    System.out.println("Mountains [Sia, Diplo, Labrinth]");
                    System.out.println("Runaway [Lil Peep]");
                    System.out.println("The Greatest Show [Panic! At The Disco]");
                    System.out.println("All Out Life [Slipknot])");
                    setMenuAction(menuAction);
                } else {
                    System.out.println("Please, provide access for application.");
                    setMenuAction(menuAction);
                }
                break;
            case "featured":
                if(auth == true){
                System.out.println("---FEATURED---\n" +
                        "Mellow Morning\n" +
                        "Wake Up and Smell the Coffee\n" +
                        "Monday Motivation\n" +
                        "Songs to Sing in the Shower");
                setMenuAction(menuAction);
                } else {
                    System.out.println("Please, provide access for application.");
                    setMenuAction(menuAction);
                }

                break;
            case "categories":
                if(auth == true){
                System.out.println("---CATEGORIES---\n" +
                        "Top Lists\n" +
                        "Pop\n" +
                        "Mood\n" +
                        "Latin");
                setMenuAction(menuAction);
                } else {
                    System.out.println("Please, provide access for application.");
                    setMenuAction(menuAction);
                }
                break;
            case "playlists Mood":
                if(auth == true){
                System.out.println("---MOOD PLAYLISTS---\n" +
                        "Walk Like A Badass  \n" +
                        "Rage Beats  \n" +
                        "Arab Mood Booster  \n" +
                        "Sunday Stroll");
                setMenuAction(menuAction);
                } else {
                    System.out.println("Please, provide access for application.");
                    setMenuAction(menuAction);
                }
                break;
            case "auth":
                authorization();
                System.out.println(redirect_uri);
                break;
            case "exit":
                System.out.println("---GOODBYE!---");
                setMenuAction(menuAction);
                return;
        }

    }
}
