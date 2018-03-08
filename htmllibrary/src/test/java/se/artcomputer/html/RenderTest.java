package se.artcomputer.html;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static se.artcomputer.html.Html.*;

public class RenderTest {

    private static final String SOME_TEXT = "some text";
    private static final String SOME_CLASS = "someClass";
    private static final String SOME_HEADLINE = "some head line";

    @Test
    public void renderEmptyDivNode() {
        assertEquals("<div ></div>", div().toString());
    }

    @Test
    public void renderDivNodeWithText() {
        assertEquals("<div >" + SOME_TEXT + "</div>", div(text(SOME_TEXT)).toString());
    }

    @Test
    public void renderDivNodeWithAttribute() {
        String actual = div(new Attribute("class", SOME_CLASS)).toString();
        assertEquals("<div class=\"" + SOME_CLASS + "\"></div>", actual);
    }

    @Test
    public void renderPage() {
        String actual = Html.html(
                head(),
                body(
                        h1(text(SOME_HEADLINE)),
                        div(text(SOME_TEXT))))
                .toString();
        assertEquals("<html ><head ></head><body ><h1 >" + SOME_HEADLINE + "</h1>" +
                "<div >" + SOME_TEXT + "</div></body></html>", actual);
    }
}
