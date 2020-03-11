package util;

public class FrontendHelperfunctions {


    public static String getUserMenuText(String role) {

        switch (role){
            case "customer": return "Du er en kunde";
            case "employee": return "Du er ansat i butikken";
            default: return "Du er ukendt";
        }
    }
}
