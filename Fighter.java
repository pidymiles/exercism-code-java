abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {
    private int damage;
    @Override
    public String toString() {
        return ("Fighter is a Warrior");
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() == true ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean prep = false;
    @Override
    boolean isVulnerable() {
        return prep == false ? true : false; 
    }

    @Override
    int damagePoints(Fighter warrior) {
        return prep == true ? 12 : 3;
    }

    void prepareSpell() {
        prep = true;
    }
}
