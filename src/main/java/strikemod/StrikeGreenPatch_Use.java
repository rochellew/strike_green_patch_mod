package strikemod;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;

import com.megacrit.cardcrawl.cards.green.Strike_Green;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.powers.PoisonPower;

@SpirePatch(clz = Strike_Green.class, method = "use")
public class StrikeGreenPatch_Use {

    @SpirePostfixPatch
    public static void Postfix(Strike_Green __instance, AbstractPlayer p, AbstractMonster m) {
        int poisonAmount = __instance.upgraded ? __instance.magicNumber : __instance.magicNumber;

        AbstractDungeon.actionManager.addToBottom(
                (new ApplyPowerAction(m, p, new PoisonPower(m, p, poisonAmount), poisonAmount)));
    }
}