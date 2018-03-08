package se.artcomputer.html;

@SuppressWarnings("WeakerAccess")
public class Html {

    private static final String HTML = "html";
    private static final String HEAD = "head";
    private static final String LINK = "link";
    private static final String BODY = "body";
    private static final String H1 = "h1";
    private static final String DIV = "div";
    private static final String A = "a";


    private static Node node(String nodeName, Attributes attributeList, Node... content) {
        return new Node(nodeName, attributeList, new Nodes(content));
    }

    private static Node node(String nodeName) {
        return new Node(nodeName, new Attributes(), new Nodes());
    }

    private static Node node(String nodeName, HtmlAttribute... attributes) {
        return new Node(nodeName, new Attributes(attributes), new Nodes());
    }

    public static Attributes attributes(HtmlAttribute... attributes) {
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

    public static Node link(Attributes attributes) {
        return node(LINK, attributes);
    }

    public static Node body() {
        return node(BODY);
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

    public static Node div() {
        return node(DIV);
    }

    public static Node div(HtmlAttribute... attributes) {
        return node(DIV, attributes);
    }

    public static Node div(Node... contents) {
        return node(DIV, contents);
    }

    public static Node a() {
        return node(A);
    }

    public static Node a(HtmlAttribute attribute, Node... content) {
        return node(A, attributes(attribute), content);
    }

    public static Node a(Attributes attributes, Node... content) {
        return node(A, attributes, content);
    }

    public static Node text(String textString) {
        return new Text(textString);
    }
}
