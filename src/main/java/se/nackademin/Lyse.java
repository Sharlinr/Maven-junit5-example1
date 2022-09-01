package se.nackademin;

public class Lyse {

    public boolean helLjusPå = false;
    public boolean halvLjusPå = false;
    public boolean bakLysePå = false;
    public boolean bromsLjusPå = false;

    public String ändraLyseHelHalv() {

        if (halvLjusPå) {
            halvLjusPå = false;
            helLjusPå = true;
            return "Halvljus ändrat till helljus";
        } else if (helLjusPå) {
            helLjusPå = false;
            halvLjusPå = true;
            return "Helljus ändrat till halvljus";
        } else {
            halvLjusPå = true;
            helLjusPå = false;
            return "Halvljus tänds";
        }

    }

    public String stängAv(){

        helLjusPå = false;
        halvLjusPå = false;
        bakLysePå = false;
        bromsLjusPå = false;

        return "All belysning släckt";
    }

}
