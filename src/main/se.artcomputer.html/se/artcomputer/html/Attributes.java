package se.artcomputer.html;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("WeakerAccess")
public class Attributes {
    private final List<Attribute> attributeList;


    public Attributes(Attribute... attributeList) {
        this.attributeList = Arrays.stream(attributeList).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return attributeList.stream().map(Object::toString).collect(Collectors.joining(" "));
    }
}
