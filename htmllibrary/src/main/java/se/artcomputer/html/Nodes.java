package se.artcomputer.html;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nodes {

    private final List<Node> nodeList;

    public Nodes(Node... nodeList) {
        this.nodeList = Arrays.stream(nodeList).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return nodeList.stream().map(Object::toString).collect(Collectors.joining());
    }
}
