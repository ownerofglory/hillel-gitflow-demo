package ua.ithillel.gitflow.manager;

public class StringManagerDefault implements StringManager {
    @Override
    public int stringLength(String string) {
        return string.length();
    }
}
