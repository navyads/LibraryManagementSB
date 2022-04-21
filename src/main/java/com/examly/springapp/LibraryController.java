package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    
    @Autowired
    public LibraryService ls;
    
    @PostMapping("/saveBook")
    public void addBook(@RequestBody Library l)
    {
        ls.addBook(l);
    }
    
    @PostMapping("/editBook/{bookId}")
    public void editBook(@PathVariable String bookId, @RequestBody
    Library l)
    {
        ls.editBook(bookId,l);
    }
    
    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable String bookId)
    {
        return ls.deleteBook(bookId);
    }
    
    @GetMapping("/getBooks")
    public List<Library> getAllBooks()
    {
        return ls.getAllBooks();
    }
    
    @GetMapping("/getByType/{genre}")
    public List<Library> getByGenre(@PathVariable String genre,
    @RequestBody Library l)
    {
        return ls.getByGenre(genre,l);
    }
}
