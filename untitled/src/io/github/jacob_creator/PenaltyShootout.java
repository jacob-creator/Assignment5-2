package io.github.jacob_creator;

import io.github.jacob_creator.KickResults;

public class PenaltyShootout {

    private int scoredCounter;
    private int totalKicked;
    private final Player goalie;

    public PenaltyShootout(Player goalie) {
        this.goalie = goalie;
        this.scoredCounter = 0;
        this.totalKicked = 0;
    }

    /*
    You'll notice the kicker is changed out each time. This makes it so
    you can change kickers whenever you want

    This method should check to compare the levels of the kicker and the goalie
    to decide who should win this penalty kick.

    Use the io.github.jacob_creator.Player#compareTo(io.github.jacob_creator.Player) method for assistance.

    If the kicker and goalie both have the same level, make the winner random.
    To do this, use Math.random() which returns a double between 0.0 and 1.0.
    From there, check if the number returned is less than 0.5. This gives a 50%
    chance. More examples can be found online.
     */


    public KickResults kick(Player kicker) {
        double poggers = Math.random();
        if(kicker.compareTo(goalie) == 1){
            increment(true);
            return KickResults.SCORED;
        } else if(kicker.compareTo(goalie) == -1){
            increment(false);
            return KickResults.SAVED;
        } else{
            if(poggers <= 0.5){
                increment(false);
                return KickResults.SAVED;
            } else
                increment(true);
                return KickResults.SCORED;
        }
    }

    /*
     When would it make sense to use this method? You can decide
     for yourself when this should be called
     */
    private void increment(boolean didScore) {
        if(didScore) {
            scoredCounter++;
        }
        totalKicked++;
    }

    /*
     What would make sense to represent a penalty shootout as a string?
     You can decide what makes this match a match
     */
    @Override
    public String toString() {
        return "The score is " + scoredCounter + ". There have been a total of " + totalKicked + " kicks.\n";
    }
}
