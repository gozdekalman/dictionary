package com.gozde.mongospringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "words")
public class Word {
    @Id
    private String id;
    private String title;
    private List<String> descriptions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getDescription() {
        return descriptions;
    }

    public void setDescription(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
