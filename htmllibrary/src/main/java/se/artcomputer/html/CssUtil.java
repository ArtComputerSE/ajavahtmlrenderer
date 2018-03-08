package se.artcomputer.html;

import static se.artcomputer.html.Attribute.href;

public class CssUtil {

    public static Attributes styleSheet(String path) {
        return new Attributes(
                new Attribute("rel", "stylesheet"),
                new Attribute("type", "text/css"),
                href(path));

    }
}
