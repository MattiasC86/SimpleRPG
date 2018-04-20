public class Player {
    private int positionX;
    private int positionY;

    private String characterClass;
    private String name;

    private int strength;
    private int spellPower;
    private int vitality;

    public Player(int charClass) {
        this.positionX = 0;
        this.positionY = 0;
        switch(charClass) {
            case 1: //Warrior
                this.characterClass = "Warrior";
                this.strength = 10;
                this.spellPower = 2;
                this.vitality = 8;
                break;
            case 2: //Mage
                this.characterClass = "Mage";
                this.strength = 5;
                this.spellPower = 10;
                this.vitality = 5;
                break;
        }

    }

    public String getCharacterClass() {
        return this.characterClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name set to " + name);
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
}
