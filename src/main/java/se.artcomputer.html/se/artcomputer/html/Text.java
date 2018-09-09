package se.artcomputer.html;

@SuppressWarnings("WeakerAccess")
public class Text extends Node {
    private String textString;

    public Text(String textString) {
        this.textString = textString;
    }

    @Override
    public String toString() {
        return textString;
    }
}
