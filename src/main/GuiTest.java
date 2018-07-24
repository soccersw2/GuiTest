package main;

import data.*;
import org.rspeer.script.ScriptCategory;
import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.Task;
import org.rspeer.script.task.TaskScript;
import org.rspeer.ui.Log;
import task.Started;

@ScriptMeta(name = "Gui Test",  desc = "Tests gui", developer = "ADivorcedFork", category = ScriptCategory.OTHER, version = 0.01)
public class GuiTest extends TaskScript {

    private Gui gui;
    private ScriptOptions options;
    public static Jewelry jewelry;

    private static final Task[] TASKS = { new Started() };

    @Override
    public void onStart() {
        gui = new Gui();
        gui.setVisible(true);
        options = gui.getOptions();
        jewelry = options.getJewelry();
        Log.info("Submitting tasks...");
        submit(TASKS);
    }
}
