package task;

import main.GuiTest;
import org.rspeer.script.task.Task;
import org.rspeer.ui.Log;

public class Starting extends Task {
    @Override
    public int execute() {
        Log.info("Starting = true. Script started...");
        return 500;
    }

    @Override
    public boolean validate() {
        return GuiTest.jewelry != null;
    }
}
