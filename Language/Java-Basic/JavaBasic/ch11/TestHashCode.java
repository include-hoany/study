package ch11;

import java.util.Objects;

public class TestHashCode {
  public static void main(String[] args) {
    int hashNumber = Objects.hash("우오앙 해쉬당") % 8;
    System.out.println(hashNumber);
    hashNumber = Math.abs(Objects.hash("우오앙 해쉬")) % 8;
    System.out.println(hashNumber);
    hashNumber = Math.abs(Objects.hash("우오앙 쉬당")) % 8;
    System.out.println(hashNumber);
    hashNumber = Math.abs(Objects.hash("우오앙해쉬당")) % 8;
    System.out.println(hashNumber);
    hashNumber = Math.abs(Objects.hash("집이최고")) % 8;
    System.out.println(hashNumber);
    hashNumber = Math.abs(Objects.hash("졸려")) % 8;
    System.out.println(hashNumber);
  }

}
