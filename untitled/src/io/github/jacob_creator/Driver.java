package io.github.jacob_creator;

/*
 Complete these classes and follow the rubric for full credit.
 */
public class Driver {

    public static void main(String[] args) {

        Player[] loserClub = {new Player("Andres", 7),new Player("Lucio", 5),new Player("Julio", 14),new Player("Jose2", 3),new Player("Juan", 16)};
        Player[] winnerClub = {new Player("Alejandro", 4),new Player("Javier", 8),new Player("Rojo", 10),new Player("Azul", 2),new Player("Rojo2", 18)};

        PenaltyShootout[] teams = {
                new PenaltyShootout(new Player("Jose", 14)),
                new PenaltyShootout(new Player("Miguel", 12))
        };

        for(int i = 0; i<loserClub.length; i++){
            teams[1].kick(loserClub[i]);
        }
        for(int i = 0; i<winnerClub.length; i++){
            teams[0].kick(winnerClub[i]);
        }

        System.out.println("The Score of the loser club is: " + teams[0]);
        System.out.println("The Score of the winner club is: " + teams[1]);
    }
}
