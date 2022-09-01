package se.nackademin;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LyseTest {

    @Test
    void ändraLyseHelHalv() {

        Lyse lyse = new Lyse();

        assertTrue(lyse.ändraLyseHelHalv().equals("Halvljus tänds"));
    }

    @Test
    void stängAv(){

        Lyse lyse = new Lyse();
        assertTrue(lyse.stängAv().equals("All belysning släckt"));
        assertTrue(!lyse.bakLysePå && !lyse.bromsLjusPå && !lyse.halvLjusPå && !lyse.helLjusPå);

    }
}