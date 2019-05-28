package com.phdua.manager.test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class Jioner {
    public static void main(String[] args) {
        Joiner joiner = Joiner.on("; ").skipNulls();

        System.out.println("joiner.join(\"Harry\", null, \"Ron\", \"Hermione\") = " + joiner.join("Harry", null, "Ron", "Hermione"));


        System.out.println("joiner = " + Splitter.on(',').trimResults()
                .omitEmptyStrings()
                .split("foo,bar,,   qux"));

        Iterable<String> pps=Splitter.on(',').trimResults()
                .omitEmptyStrings()
                .split("foo,bar,,   qux");

    }
}
