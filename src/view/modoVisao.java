package view;

import java.util.ArrayList;
import java.util.List;

public class modoVisao {

    private static boolean darkModeOn;

    public static boolean isDarkModeOn() {
        return darkModeOn;
    }

    public static void toggleVisao() {
        darkModeOn = !darkModeOn;
    }
}
