package se.artcomputer.html;

public class Attribute {
    private final String key;
    private final String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static Attribute className(String className) {
        return new Attribute("class", className);
    }

    public static Attribute href(String url) {
        return new Attribute("href", url);
    }

    public static Attribute name(String name) {
        return new Attribute("name", name);
    }

    @Override
    public String toString() {
        return String.format("%s=\"%s\"", key, value);
    }

}
