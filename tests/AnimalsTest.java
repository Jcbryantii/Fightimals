import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {



    @Test
    public void testExtendsAnimal() {
        assertEquals(Animals.class, Lion.class.getSuperclass());
        assertEquals(Animals.class, Hippo.class.getSuperclass());
        assertEquals(Animals.class, Hyena.class.getSuperclass());

    }

    @Test
    public void testLionToString() {

        Lion lion = new Lion();

        String message = "Select a Lion?\n" +
                " Its attack is " + InitialStats.LION_ATK + ".\n" +
                "Its defense is " + InitialStats.LION_DEF + ".\n" +
                "Its heal power is " + InitialStats.LION_REG + ".\n\n";

        assertEquals(message, lion.toString());
        System.out.println(lion.toString());
    }
    @Test
    public void testHyenaToString() {

        Hyena hyena = new Hyena();

        String message = "Select a Hyena?\n" +
                "Its attack is " + InitialStats.HYENA_ATK + ".\n" +
                "Its defense is " +  InitialStats.HYENA_DEF + ".\n" +
                "Its heal power is " + InitialStats.HYENA_REG + ".\n\n";

        assertEquals(message, hyena.toString());
        System.out.println(hyena.toString());
    }
    @Test
    public void testHippoToString() {

        Hippo hippo = new Hippo();

        String message = "Select a Hippo?\n" +
                "Its attack is " + InitialStats.HIPPO_ATK + ".\n" +
                "Its defense is " +  InitialStats.HIPPO_DEF + ".\n" +
                "Its heal power is " + InitialStats.HIPPO_REG + ".\n\n";

        assertEquals(message, hippo.toString());
        System.out.println(hippo.toString());
    }

    @Test
    public void testAbstractSpecial() {
        Lion lion = new Lion();

        assertEquals(12, lion.special(InitialStats.LION_DEF));
    }

    @Test
    public void testAttackMethod() {
        Lion lion = new Lion();


       assertEquals(93,lion.attack(lion));
    }
}