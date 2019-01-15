package com.raghvendra;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
	// write your code here
        getDurationString(2401L);
        getDurationString(61L,90L);
    }
    private static String getDurationString(long minutes, long seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minutes / 60;
            String hourString = hours + "h ";
            if(hours < 10) {
                hourString = "0" + hourString;
            }
            long remMinutes = minutes % 60;
            String remMinutesString = remMinutes + "m ";
            if(remMinutes < 10) {
                remMinutesString = "0" + remMinutesString;
            }
            String secondsString = seconds + "s";
            if(seconds < 10) {
                secondsString = "0" + secondsString;
            }
            System.out.println(hourString + remMinutesString + secondsString);
            return hourString + remMinutesString + secondsString;
        }
    }
    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = seconds / 60;
            long remSeconds = seconds % 60;
            return getDurationString(minutes, remSeconds);
        }
    }
}
