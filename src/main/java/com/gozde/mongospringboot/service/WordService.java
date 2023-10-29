package com.gozde.mongospringboot.service;

import com.gozde.mongospringboot.dto.AllWordsResponse;
import com.gozde.mongospringboot.dto.CreateWordRequest;
import com.gozde.mongospringboot.model.Word;
import com.gozde.mongospringboot.repository.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService{
    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository){
        this.wordRepository=wordRepository;
    }

    public AllWordsResponse getAllWords(){
        List<Word> words = wordRepository.findAll();
        AllWordsResponse allWordsResponse = new AllWordsResponse();
        allWordsResponse.setWords(words);
        return allWordsResponse;
    }

    public Word createWord(CreateWordRequest request) {
        Word word = new Word();
        word.setTitle(request.getTitle());
        word.setDescription(request.getDescriptions());
        return wordRepository.save(word);
    }

}
