package se.artcomputer.html;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RenderTest {

    @Test
    public void renderEmptyDivTag() {
        assertEquals("<div ></div>", se.artcomputer.html.Html.div().toString());
    }
}
