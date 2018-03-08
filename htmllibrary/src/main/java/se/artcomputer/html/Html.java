package se.artcomputer.html;

public class Html {

    public static Node node(String nodeName, Attributes attributeList, se.artcomputer.html.Nodes content) {
        return new Node(nodeName, attributeList, content);
    }

    private static Node node(String nodeName) {
        return node(nodeName, new Attributes(), new se.artcomputer.html.Nodes());
    }

    public static Node div() {
        return node("div");
    }
}
