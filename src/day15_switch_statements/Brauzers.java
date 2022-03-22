package day15_switch_statements;

public class Brauzers {
    public static void main(String[] args) {

        String browser = "Chrome";
        String url = "www.google.com";


        switch (browser) {
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening " + url + " in safari");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in firefox");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
        }
    }
}
