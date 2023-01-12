package com.hoany.chaptor01.item03.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

    // serialVersionUID를 별도로 관리하면 클래스 구조가 변경되더라도 역직렬화된다.
    // 단 변경된 필드의 값은 역직렬화되지 않는다.
    private static final long serialVersionUID = 1L;

    public static String name;
    private String isbn;
    private String title;
    private String author;
    private LocalDate published;

    // transient를 사용하면 직렬화에서 제외할 수 있다.
    private transient int numberOfSold;

    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn + "\n" +
                ", title=" + title + "\n" +
                ", author=" + author +"\n" +
                ", published=" + published + "\n" +
                ", numberOfSold=" + numberOfSold + "\n" +
                ", BookName= " + Book.name + "}";
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
}
