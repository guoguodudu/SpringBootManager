package com.phdua.manager.test;

public interface Animal {
    @NotEmpty
    String getName();

    @NotEmpty
    String getOwnerName();
}
