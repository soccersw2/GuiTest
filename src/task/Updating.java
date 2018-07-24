package task;

import main.GuiTest;
import org.rspeer.script.task.Task;
import org.rspeer.ui.Log;

public class Updating extends Task {
    @Override
    public int execute() {
        Log.info("Updating: Trying to set jewelry");
        GuiTest.options = GuiTest.gui.getOptions();
        if (GuiTest.options != null) GuiTest.jewelry = GuiTest.options.getJewelry();
        return 500;
    }

    @Override
    public boolean validate() {
        return GuiTest.jewelry == null;
    }
}
