package strikemod;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;

import com.megacrit.cardcrawl.cards.green.Strike_Green;

@SpirePatch(clz = Strike_Green.class, method = "upgrade")
public class StrikeGreenPatch_Upgrade {
    @SpirePostfixPatch
    public static void Postfix(Strike_Green __instance) {
        __instance.baseMagicNumber = 3;
        __instance.magicNumber = 3;
        __instance.isMagicNumberModified = true;
        __instance.rawDescription = "Deal !D! damage. NL Apply !M! Poison.";
        __instance.initializeDescription();
    }
}
