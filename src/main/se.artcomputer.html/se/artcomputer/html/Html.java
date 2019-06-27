package se.artcomputer.html;

@SuppressWarnings("WeakerAccess")
public class Html {

    @SuppressWarnings("squid:S1700")
    private static final String A = "a";
    private static final String BODY = "body";
    private static final String DIV = "div";
    private static final String FORM = "form";
    private static final String HEAD = "head";
    private static final String HTML = "html";
    private static final String H1 = "h1";
    private static final String INPUT = "input";
    private static final String LINK = "link";
    private static final String META = "meta";
    private static final String P = "p";

    private Html() {
        // Utility class
    }

    private static Node node(String nodeName, Attributes attributeList, Node... content) {
        return new Node(nodeName, attributeList, new Nodes(content));
    }

    private static Node node(String nodeName) {
        return new Node(nodeName, new Attributes(), new Nodes());
    }

    private static Node node(String nodeName, Attribute... attributes) {
        return new Node(nodeName, new Attributes(attributes), new Nodes());
    }

    public static Attributes attributes(Attribute... attributes) {
        return new Attributes(attributes);
    }

    private static Node node(String nodeName, Node... contents) {
        return new Node(nodeName, new Attributes(), new Nodes(contents));
    }

    public static Node html(Node... contents) {
        return node(HTML, contents);
    }

    public static Node head(Node... contents) {
        return node(HEAD, contents);
    }

    public static Node meta(Attributes attributes) {
        return node(META, attributes);
    }

    public static Node link(Attributes attributes) {
        return node(LINK, attributes);
    }

    public static Node body(Attributes attributes, Node... contents) {
        return node(BODY, attributes, contents);
    }

    public static Node body(Node... contents) {
        return node(BODY, contents);
    }

    public static Node h1(Node... contents) {
        return node(H1, contents);
    }

    public static Node h1(Attributes attributes, Node... contents) {
        return node(H1, attributes, contents);
    }

    public static Node paragraph(Node... contents) {
        return node(P, contents);
    }

    public static Node div() {
        return node(DIV);
    }

    public static Node div(Attribute... attributes) {
        return node(DIV, attributes);
    }

    public static Node div(Node... contents) {
        return node(DIV, contents);
    }

    public static Node a() {
        return node(A);
    }

    public static Node a(Attribute attribute, Node... content) {
        return node(A, attributes(attribute), content);
    }

    public static Node a(Attributes attributes, Node... content) {
        return node(A, attributes, content);
    }

    public static Node form(Attributes attributes, Node... content) {
        return node(FORM, attributes, content);
    }

    public static Node input(Attribute... attributes) {
        return node(INPUT, attributes);
    }

    public static Node submit(String text) {
        return node(INPUT,
                attributes(
                        new Attribute("type", "submit"),
                        new Attribute("value", text)
                ));
    }

    public static Node text(String textString) {
        return new Text(textString);
    }
}
