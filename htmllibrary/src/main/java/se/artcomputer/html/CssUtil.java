package se.artcomputer.html;

import static se.artcomputer.html.Attribute.*;

public class CssUtil {

    public static Attributes styleSheet(String path) {
        return new Attributes(
                rel("stylesheet"),
                type("text/css"),
                href(path));

    }
}
