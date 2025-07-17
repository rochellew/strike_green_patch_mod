package strikemod;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

import basemod.BaseMod;
import basemod.interfaces.EditCardsSubscriber;

@SpireInitializer
public class SilentStrikePatchMod implements EditCardsSubscriber {
    public SilentStrikePatchMod() {
        BaseMod.subscribe(this);
    }

    @Override
    public void receiveEditCards() {

    }
}
