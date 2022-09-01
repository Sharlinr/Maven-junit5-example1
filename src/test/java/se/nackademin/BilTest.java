package se.nackademin;

import org.junit.jupiter.api.Test;
import se.nackademin.Bil;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    @Test
    void startaBilen() {

        Bil bil = new Bil();

        assertTrue(bil.startaBilen().equals("Bilen startas"));
        assertTrue(bil.lyse.halvLjusPå);
        assertTrue(!bil.lyse.helLjusPå);
    }

    @Test
    void bilAvstängd() {
        Bil bil = new Bil();
        bil.startaBilen();
        bil.bilAvstängd();
        assertTrue(!bil.lyse.halvLjusPå && !bil.lyse.bakLysePå && !bil.lyse.helLjusPå);
        assertTrue(bil.bilAvstängd().equals("Bilen är avstängd"));
    }

    @Test
    void gas() {
        Bil bil = new Bil();

        assertTrue(bil.hastighet == 0);
        bil.gas();
        assertTrue(!bil.lyse.bromsLjusPå);
        assertTrue(bil.hastighet == 10);
    }

    @Test
    void broms() {
        Bil bil = new Bil();

        for (int i = 0; i < 3; i++) {
            bil.gas();
        }
        bil.broms();
        assertTrue(bil.lyse.bromsLjusPå);
        assertTrue(bil.hastighet == 20);
    }

    @Test
    void backarBak() {
        Bil bil = new Bil();

        assertTrue(bil.backarBak().equals("Bilen backar"));
        assertTrue(bil.lyse.bakLysePå && bil.bilenBackar);
    }
}