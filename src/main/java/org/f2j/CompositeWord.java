package org.f2j;

import java.util.ArrayList;
import java.util.List;

public class CompositeWord extends Word {

    protected List<Word> words = new ArrayList<Word>();

    public CompositeWord(String value) {
        super(value);
    }

    public void addWord(Word word) {
        words.add(word);
    }

    @Override
    public String getNativeCode() {
        StringBuilder strBuilder = new StringBuilder();
        for (Word word : words) {
            strBuilder.append(String.format("%s\n", word.getNativeCode()));
        }
        return strBuilder.toString();
    }

    @Override
    public String getDefinition() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Word word : words) {
            stringBuilder.append(String.format("%s ", word.getValue()));
        }

        return stringBuilder.toString();
    }
}
