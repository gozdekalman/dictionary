package com.gozde.mongospringboot.dto;

import com.gozde.mongospringboot.model.Word;

import java.util.List;

public class AllWordsResponse {
    private List<Word> words;

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
