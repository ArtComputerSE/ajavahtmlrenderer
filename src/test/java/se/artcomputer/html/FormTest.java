package se.artcomputer.html;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static se.artcomputer.html.Attribute.action;
import static se.artcomputer.html.Attribute.name;
import static se.artcomputer.html.Html.*;

public class FormTest {

    private static final String FIRST_NAME = "First name: ";
    private static final String INPUT_NAME = "firstName";
    private static final String SUBMIT_TEXT = "Enter!";
    private static final String FORMACTION = "/formaction";

    @Test
    public void formPage() {
        String formStart = "<form action=\"" + FORMACTION + "\">";
        String inputTag = "<input name=\"" + INPUT_NAME + "\"></input>";
        String divBlock = "<div >" + FIRST_NAME + inputTag + "</div>";
        String submitButton = "<input type=\"submit\" value=\"" + SUBMIT_TEXT + "\"></input>";
        String expected = formStart + divBlock + "<div >" + submitButton + "</div></form>";

        Node form = form(
                attributes(action(FORMACTION)),
                div(
                        text(FIRST_NAME),
                        input(name(INPUT_NAME))
                ),
                div(submit(SUBMIT_TEXT))
        );
        assertThat(form.toString(), is(expected));
    }
}
