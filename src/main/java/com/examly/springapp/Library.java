package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lib")
public class Library {
    @Id
    private String bookId;
    private String quantity;
    private String bookName;
    private String genre;
    
    public String getBookId() {
        return bookId;
    }
    
    public String getQuantity() {
        return quantity;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
}