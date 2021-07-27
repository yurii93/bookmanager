package com.yuravashchenko.bookmanager.service;

import com.yuravashchenko.bookmanager.model.Book;

import java.util.List;

public interface BookService {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
