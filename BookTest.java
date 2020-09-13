import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите вес книги: ");
        book.setWeight(in.nextInt());

        System.out.println("Введите колво страниц: ");
        book.setPage(in.nextInt());

        System.out.println("Введите длину: ");
        book.setLenght(in.nextInt());

        System.out.println(book.getWeight() + " " + book.getPage() + " " + book.getLenght());
    }
}
