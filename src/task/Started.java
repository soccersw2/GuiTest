package task;

import main.GuiTest;
import org.rspeer.script.task.Task;
import org.rspeer.ui.Log;

public class Started extends Task {
    @Override
    public int execute() {
        Log.info("Started = true. Script started...");
        return 500;
    }

    @Override
    public boolean validate() {
        return GuiTest.jewelry != null;
    }
}
