package main;

import data.*;
import org.rspeer.script.ScriptCategory;
import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.Task;
import org.rspeer.script.task.TaskScript;
import org.rspeer.ui.Log;
import task.Starting;
import task.Updating;

@ScriptMeta(name = "Gui Test",  desc = "Tests gui", developer = "ADivorcedFork", category = ScriptCategory.OTHER, version = 0.01)
public class GuiTest extends TaskScript {

    public static Gui gui;
    public static ScriptOptions options = null;
    public static Jewelry jewelry;

    private static final Task[] TASKS = { new Updating(), new Starting() };

    @Override
    public void onStart() {
        gui = new Gui();
        gui.setVisible(true);
        Log.info("Submitting tasks...");
        submit(TASKS);
    }
}
