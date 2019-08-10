package com.hedyhidoury.calendar.horizontallibrary.utils;

/**
 * Created by rhezalim on 2019-08-08.
 */
public final class TranslateUtils {

    private TranslateUtils() { }

    public static String translateDay(String src){
        String day = "";

        if (src.equalsIgnoreCase("mo"))
            day = "Sen";
        else if (src.equalsIgnoreCase("tu"))
            day = "Sel";
        else if (src.equalsIgnoreCase("we"))
            day = "Rab";
        else if (src.equalsIgnoreCase("th"))
            day = "Kam";
        else if (src.equalsIgnoreCase("fr"))
            day = "Jum";
        else if (src.equalsIgnoreCase("sa"))
            day = "Sab";
        else if (src.equalsIgnoreCase("su"))
            day = "Min";

        return day;
    }

}
