package se.artcomputer.html.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.artcomputer.html.HtmlAttribute;

import static se.artcomputer.html.CssUtil.styleSheet;
import static se.artcomputer.html.Html.*;
import static se.artcomputer.html.HtmlAttribute.className;
import static se.artcomputer.html.HtmlAttribute.href;

@RestController
public class NextController {

    private static final HtmlAttribute blueText = new HtmlAttribute("style", "color : blue");
    private static final HtmlAttribute greenText = new HtmlAttribute("style", "color : green");

    @RequestMapping("/next")
    public String index() {
        return html(
                head(
                      link(styleSheet("/main.css"))
                ),
                body(
                        attributes(blueText),
                        h1(
                                attributes(greenText),
                                text("We are now on the next page")),
                        div(
                                text("Here we thrive with Java rendering pages.")),
                        div(
                                a(
                                        attributes(
                                                className("button"),
                                                href("/")),
                                        text("Click here for home page"))
                        ))
        ).toString();
    }
}
