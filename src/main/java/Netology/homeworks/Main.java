package Netology.homeworks;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FromDate();
        post.birthday.day = 13;
        post.birthday.month = 03;
        post.birthday.year = 2001;

        post.name = "Иван";
        post.passport = "1234 №28344567";
        post.patronymic = "Пупочкин";
        post.phone = "+7 (123) 321 23 21";
        post.surname = "Иванович";
        post.sibscription = true;
        System.out.println();
    }
}