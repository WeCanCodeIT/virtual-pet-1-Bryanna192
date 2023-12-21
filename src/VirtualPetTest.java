import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    void testDrink() {
        VirtualPet cat = new VirtualPet("cat", "Mika", 50, 50, 100);
        cat.drink();
        assertEquals(40, cat.getThirst());
    }

    @Test
    void testFeed() {
        VirtualPet cat = new VirtualPet("cat", "Mika", 50, 50, 100);
        cat.feed();
        assertEquals(40, cat.getHunger());
    }

    @Test
    void testPlay() {
        VirtualPet cat = new VirtualPet("cat", "Mika", 50, 50, 100);
        cat.play();
        assertEquals(85, cat.getBoredom());

    }

    @Test
    void testTick() {
        VirtualPet cat = new VirtualPet("cat", "Mika", 50, 50, 100);
        cat.tick();
        assertEquals(53, cat.getHunger());
        assertEquals(52, cat.getThirst());
        assertEquals(105, cat.getBoredom());
    }
}
