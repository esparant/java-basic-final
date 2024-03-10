package extends1.ex;


import extends1.ex.item.*;
// public 이여도 import 가 필요하다.

public class ItemMain {
    public static void main(String[] args) {

        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "Seo");
        Movie movie = new Movie("영화1", 10000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
