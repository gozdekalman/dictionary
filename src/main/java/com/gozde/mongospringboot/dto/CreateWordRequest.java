package com.gozde.mongospringboot.dto;

import java.util.List;

public class CreateWordRequest {
    private String title;
    private List<String> descriptions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
