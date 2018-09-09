package se.artcomputer.html;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CssUtilTest {

    private static final String SOME_PATH = "some-path";

    @Test
    public void styleSheet() {
        String expected = "rel=\"stylesheet\" type=\"text/css\" href=\"some-path\"";
        assertThat(CssUtil.styleSheet(SOME_PATH).toString(), is(expected));
    }
}