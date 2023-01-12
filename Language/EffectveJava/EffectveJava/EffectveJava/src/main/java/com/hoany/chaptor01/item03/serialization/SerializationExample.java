package com.hoany.chaptor01.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    private void serialize(Book book) {
        try(ObjectOutput output = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
            output.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book deserialize() {
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
            return (Book) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 직렬화 후 클래스의 구조가 변경후 역직렬화를 진행하면 역직렬화가 되지 않는다 왜냐화면
    // 클래스 구조가 변경된다면 serialVersionUID가 변경되기 때문이다.
    public static void main(String[] args) {
        Book book = new Book("12345", "이펙티브 자바 완벽 공략", "백기선", LocalDate.of(2022, 3, 21));
        book.setNumberOfSold(200);
        // static한 필드는 직렬화에서 제외된다.
        Book.name = "hoany";

        SerializationExample example = new SerializationExample();
        example.serialize(book);
        Book.name = "whitesihp";
        Book deserializedBook = example.deserialize();

        System.out.println(book);
        System.out.println(deserializedBook);
    }
}
