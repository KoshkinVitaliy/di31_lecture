package lecture_6;

public class Spell {
    private String spellName;
    private int cast;
    private int damage;

    public Spell(String spellName, int cast, int damage) {
        this.spellName = spellName;
        this.cast = cast;
        this.damage = damage;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getCast() {
        return cast;
    }

    public int getDamage() {
        return damage;
    }
}
