package se.nackademin;

public class Bil {

    public final boolean varningsBlinkersFungerar = true;
    public int hastighet = 0;
    public boolean bilenBackar = false;
    public Lyse lyse = new Lyse();


    public String startaBilen() {

        lyse.halvLjusPå = true;
        lyse.bakLysePå = true;
        return "Bilen startas";
    }


    public String bilAvstängd() {

        lyse.stängAv();
        hastighet = 0;
        return "Bilen är avstängd";
    }

    public String gas() {
        if (hastighet >= 180) {
            return "Maxhastighet nådd";

        } else {
            hastighet += 10;
            lyse.bromsLjusPå = false;
            return "Hastighet ökades med 10 km/h";
        }

    }

    public String broms() {
        if (hastighet <= 0) {
            return "Bilen står still";
        } else {
            hastighet -= 10;
            lyse.bromsLjusPå = true;
            return "Hastigheten sänktes med 10 km/h";

        }
    }

    public String backarBak() {
        bilenBackar = true;
        lyse.bakLysePå = true;
        return "Bilen backar";
    }


}
