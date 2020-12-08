package com.basepackage;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(190, 30));
        System.out.println(getDurationString(3980));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return  INVALID_VALUE_MESSAGE;
        }

        int hour = minutes / 60;
        minutes = minutes % 60;

        String hoursString = hour + "h";
            if (hour < 10) {
                hoursString = "0" + hoursString;
            }

        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
