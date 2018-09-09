package se.artcomputer.html;

import static se.artcomputer.html.Attribute.*;

@SuppressWarnings("WeakerAccess")
public class CssUtil {

    private CssUtil() {
        // Utility class
    }

    public static Attributes styleSheet(String path) {
        return new Attributes(
                rel("stylesheet"),
                type("text/css"),
                href(path));

    }
}
