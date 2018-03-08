package se.artcomputer.html;

public class HtmlAttribute {
    private final String key;
    private final String value;

    public HtmlAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static HtmlAttribute className(String className) {
        return new HtmlAttribute("class", className);
    }

    public static HtmlAttribute href(String url) {
        return new HtmlAttribute("href", url);
    }

    @Override
    public String toString() {
        return String.format("%s=\"%s\"", key, value);
    }

}
