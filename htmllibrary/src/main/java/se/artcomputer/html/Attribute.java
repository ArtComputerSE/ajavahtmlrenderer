package se.artcomputer.html;

@SuppressWarnings("WeakerAccess")
public class Attribute {
    private final String key;
    private final String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static Attribute action(String action) {
        return new Attribute("action", action);
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

    public static Attribute rel(String rel) {
        return new Attribute("rel", rel);
    }

    public static Attribute type(String type) {
        return new Attribute("type", type);
    }

    @Override
    public String toString() {
        return String.format("%s=\"%s\"", key, value);
    }

}
