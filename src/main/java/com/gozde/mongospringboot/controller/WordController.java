package com.gozde.mongospringboot.controller;

import com.gozde.mongospringboot.dto.AllWordsResponse;
import com.gozde.mongospringboot.dto.CreateWordRequest;
import com.gozde.mongospringboot.model.Word;
import com.gozde.mongospringboot.service.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/words")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("all")
    public ResponseEntity<AllWordsResponse> getAllWords(){
        return ResponseEntity.ok(wordService.getAllWords());
    }

    @PostMapping("create")
    public ResponseEntity<Word> createWord(@RequestBody CreateWordRequest request) {
        return ResponseEntity.ok(wordService.createWord(request));
    }

}
