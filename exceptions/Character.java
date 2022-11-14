public abstract class Character implements Movable {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;


    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }
    public Character(String name,String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public void attack(String weapon) throws WeaponException {
        System.out.println(name + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back");
    }

    protected final void unsheathe() {
        System.out.println(name + ": unsheathes his weapon.");
    }

    public void tryToAttack(String weapon) {
        try {
            if (weapon == "" || weapon == null || weapon == " ") {
                throw new WeaponException(name + ": I refuse to fight with my bare hands.");
            } else if (!(weapon == "hammer" || weapon == "sword") && RPGClass == "Warrior") {
                throw new WeaponException(name + ": A " + weapon + "?? What should I do with this?!");
            } else if (!(weapon == "magic" || weapon == "wand") && RPGClass == "Mage") {
                throw new WeaponException(name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");
            } else {
                attack(weapon);
            }
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }
}
