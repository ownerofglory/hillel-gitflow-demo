package ua.ithillel.gitflow;

import ua.ithillel.gitflow.manager.StringManager;
import ua.ithillel.gitflow.manager.StringManagerDefault;
import ua.ithillel.gitflow.ui.AppUI;

public class Application {
    public static void main(String[] args) {
        System.out.println("Starting application...");

        StringManager stringManager = new StringManagerDefault();
        AppUI appUI = new AppUI(stringManager);

        System.out.println("Application finished");
    }
}
