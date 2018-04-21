public class Hippo {

    private String name = "Hippo";
        private int attackPower;
        private int defensePower;
        private int regenPower;

    public Hippo() {
        //super (InitialStats.HIPPO_ATK, InitialStats.HIPPO_DEF,InitialStats.HIPPO_REG);
        this.attackPower = InitialStats.HIPPO_ATK;
        this.defensePower = InitialStats.HIPPO_DEF;
        this.regenPower = InitialStats.HIPPO_REG;


    }

    //@Override
    public int special(int initialStat) {
        return initialStat * 3;
    }

    @Override
    public String toString() {
        return "Select a "+ name +"?\n" +
                "Its attack is " + InitialStats.HIPPO_ATK + ".\n" +
                "Its defense is " + InitialStats.HIPPO_DEF + ".\n" +
                "Its heal power is " + InitialStats.HIPPO_REG + ".\n\n";
    }
}
