/*
 * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 * 
 * squirrelPlay(70, false) → true
 * squirrelPlay(95, false) → false
 * squirrelPlay(95, true) → true
 */

public boolean squirrelPlay(int temp, boolean isSummer) {

    int min = 59;
    int max = 91;

    if(isSummer) {
        max = 101;
    }
    if(temp > min && temp < max) {
        return true;
    }
    return false;
}