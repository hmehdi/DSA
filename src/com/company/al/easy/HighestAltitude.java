package com.company.al.easy;

public class HighestAltitude {
    public static int findHighestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int altitudeGain : gain) {
            currentAltitude += altitudeGain;
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }

        return highestAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int highestAltitude = findHighestAltitude(gain);
        System.out.println("The highest altitude reached is: " + highestAltitude);
    }
}
