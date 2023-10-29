package com.gozde.mongospringboot.repository;

import com.gozde.mongospringboot.model.Word;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<Word, Long> {
}
