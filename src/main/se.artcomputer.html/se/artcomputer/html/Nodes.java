package se.artcomputer.html;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("WeakerAccess")
public class Nodes {

    private final List<Node> nodeList;

    public Nodes(Node... nodeList) {
        this(Arrays.stream(nodeList).collect(Collectors.toList()));
    }

    public Nodes(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public String toString() {
        return nodeList.stream().map(Object::toString).collect(Collectors.joining());
    }
}
