package org.f2j.impl;

import org.f2j.Word;

public class BaseWord extends Word {

    private String nativeCode;

    @Override
    public String getNativeCode() {
        return nativeCode;
    }

    @Override
    public String getDefinition() {
        return nativeCode;
    }

    public BaseWord(String value, String nativeCode) {
        super(value);
        this.nativeCode = nativeCode;
    }
}
