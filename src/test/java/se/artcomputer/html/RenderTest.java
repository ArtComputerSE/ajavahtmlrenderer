package se.artcomputer.html;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static se.artcomputer.html.Attribute.className;
import static se.artcomputer.html.Attribute.href;
import static se.artcomputer.html.Html.*;

public class RenderTest {

    private static final String SOME_TEXT = "some text";
    private static final String SOME_CLASS = "someClass";
    private static final String SOME_HEADLINE = "some head line";
    private static final String SOME_TITLE = "someTitle";

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
        String actual = div(
                className(SOME_CLASS)
        ).toString();
        assertEquals("<div class=\"" + SOME_CLASS + "\"></div>", actual);
    }

    @Test
    public void anchorHasNoMandatoryAttributes() {
        assertThat(a().toString(), is("<a ></a>"));
    }

    @Test
    public void anchorWithUrlAndText() {
        String url = "http://www.w3.org/";
        String linkText = "CERN";
        String expected = "<a href=\"" + url + "\">" + linkText + "</a>";
        String actual = a(
                href(url),
                text(linkText)
        ).toString();
        assertThat(actual, is(expected));
    }

    @Test
    public void anchorWithTitleUrlAndText() {
        String url = "http://www.w3.org/";
        String linkText = "CERN";
        String title = "title=\"" + SOME_TITLE;
        String expected = "<a href=\"" + url + "\" " + title + "\">" + linkText + "</a>";
        String actual = a(
                attributes(
                        href(url),
                        new Attribute("title", SOME_TITLE)),
                text(linkText)
        ).toString();
        assertThat(actual, is(expected));
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

    @Test
    public void bodyWithAttributes() {
        String actual = Html.html(
                body(
                        attributes(className(SOME_CLASS)),
                        h1(attributes(className(SOME_CLASS)), text(SOME_HEADLINE))
                )
        ).toString();
        String expected = "<html ><body class=\"someClass\">" +
                "<h1 class=\"someClass\">" + SOME_HEADLINE + "</h1>" +
                "</body></html>";
        assertThat(actual, is(expected));
    }

    @Test
    public void linkWithHref() {

        String actual = Html.html(
                head(
                        link(
                                attributes(href(SOME_TEXT))
                        )
                )
        ).toString();

        String expected = "<html ><head >" +
                "<link href=\"" + SOME_TEXT + "\"></link>" +
                "</head></html>";
        assertThat(actual, is(expected));
    }

    @Test
    public void metaWithCharSet() {

        String actual = Html.html(
                head(
                        meta(
                                attributes(new Attribute("charset", "UTF-8"))
                        )
                )
        ).toString();

        String expected = "<html ><head >" +
                "<meta charset=\"UTF-8\"></meta>" +
                "</head></html>";
        assertThat(actual, is(expected));
    }

    @Test
    public void aParagraph() {
        String actual = Html.paragraph().toString();

        String expected = "<p ></p>";
        assertThat(actual, is(expected));
    }
}
