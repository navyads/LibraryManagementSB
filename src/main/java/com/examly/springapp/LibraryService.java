package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository lr;
    
    public void addBook(Library l) {
        lr.save(l);
    }
    
    public void editBook(String bookId, Library l) {
        lr.save(l);
    }
    
    public String deleteBook(String bookId) {
        lr.deleteById(bookId);
        return "Deleted Successfully";
    }
    
    public List<Library> getAllBooks() {
        List<Library> l = new ArrayList<Library>();
        lr.findAll().forEach(l::add);
        return l;
    }
    
    public List<Library> getByGenre(String genre, Library l) {
        List<Library> a = new ArrayList<Library>();
        l.setGenre(genre);
        if(l.getGenre().toString()==genre)
            a.add(l);
        return a;
    }
}
