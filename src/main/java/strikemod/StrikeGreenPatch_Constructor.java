package strikemod;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.green.Strike_Green;

@SpirePatch(clz = Strike_Green.class, method = SpirePatch.CONSTRUCTOR)
public class StrikeGreenPatch_Constructor {
    @SpirePostfixPatch
    public static void Postfix(Strike_Green __instance) {
        __instance.baseMagicNumber = 1;
        __instance.magicNumber = 1;
        __instance.rawDescription = "Deal !D! damage. NL Apply !M! Poison.";
        __instance.initializeDescription();
    }
}
