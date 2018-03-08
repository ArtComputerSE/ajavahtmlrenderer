package se.artcomputer.html;

import static se.artcomputer.html.HtmlAttribute.href;

public class CssUtil {

    public static Attributes styleSheet(String path) {
        return new Attributes(
                new HtmlAttribute("rel", "stylesheet"),
                new HtmlAttribute("type", "text/css"),
                href(path));

    }
}
