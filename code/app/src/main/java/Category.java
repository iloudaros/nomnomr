package com.example.project;

public class Category {
    private enum title{
      Asian,
      Mexican,
      Indian,
      ...
    }

    private String description;

    public title getTitle() {
      return title;
    }

    public String getDescription() {
      return description;
    }

    public void setTitle(title title) {
      this.title = title;
    }

    public void setDescription(String description) {
      this.description = description;
    }
