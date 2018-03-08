package se.artcomputer.html;

public class Node {
    private final String nodeName;
    private final Attributes attributeList;
    private final Nodes content;

    public Node(String nodeName, Attributes attributeList, Nodes content) {

        this.nodeName = nodeName;
        this.attributeList = attributeList;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("<%s %s>%s</%s>", nodeName, attributeList.toString(), content.toString(), nodeName);
    }
}
