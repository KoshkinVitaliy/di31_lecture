package lecture_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoreMaster {
    public List<Spell> spells;

    {
        spells = new ArrayList<>();
        Spell spell1 = new Spell(
                "Fireball",
                3,
                100
        );
        Spell spell2 = new Spell(
                "Lightning",
                5,
                300
        );

        Spell spell3 = new Spell(
                "Windstorm",
                4,
                200
        );

        spells.add(spell1);
        spells.add(spell2);
        spells.add(spell3);
    }

    public void castSpell(int spellIndex) {
        System.out.println("Применяется заклинание "
                + spells.get(spellIndex).getSpellName() );
    }

    public void castRandomSpell() {
        Random random = new Random();
        System.out.println("Применяется случайное заклинание "
                + spells.get(random.nextInt(spells.size())).getSpellName() );
    }
}
