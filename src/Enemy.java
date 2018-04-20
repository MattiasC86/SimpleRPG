public class Enemy {

    private String name;

    private int strength;
    private int vitality;

    Enemy(String name) {
        switch(name) {
            case "Goblin":
                this.strength = 4;
                this.vitality = 4;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
