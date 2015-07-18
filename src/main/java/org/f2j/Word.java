package org.f2j;

import java.io.Serializable;

public abstract class Word implements Serializable {
    private String value;

    public String getValue() {
        return value;
    }

    public Word(String value) {
        this.value = value;
    }

    public abstract String getNativeCode();
    public abstract String getDefinition();
}
