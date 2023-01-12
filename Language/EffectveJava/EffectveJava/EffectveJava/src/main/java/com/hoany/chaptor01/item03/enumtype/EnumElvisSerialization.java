package com.hoany.chaptor01.item03.enumtype;



import java.io.*;

import static com.hoany.chaptor01.item03.enumtype.Elvis.*;

// Enum을 사용하면 역직렬, 직렬화 싱글턴 무력화를 방법을 사용할수 있다.
public class EnumElvisSerialization {

    public static void main(String[] args) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            Elvis elvis = (Elvis) in.readObject();
            System.out.println(elvis == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
