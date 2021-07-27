package com.yuravashchenko.bookmanager.service;

import com.yuravashchenko.bookmanager.dao.BookDao;
import com.yuravashchenko.bookmanager.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Transactional
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    @Transactional
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }
}
