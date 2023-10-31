package com.abc.first;

public class item {
    private String type;

    @Override
    public String toString() {
        return "item{" +
                "type='" + type + '\'' +
                '}';
    }

    public item(String type) {
        this.type = type;
    }
}
