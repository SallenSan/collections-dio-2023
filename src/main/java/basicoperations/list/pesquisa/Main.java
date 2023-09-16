package basicoperations.list.pesquisa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookCatalog bookCatalog = new BookCatalog();

        System.out.println("adicionar livro:");
        String livro = sc.nextLine();
        System.out.println("autor: ");
        String autor = sc.nextLine();
        System.out.println("ano publicação: ");
        int ano = sc.nextInt();

        bookCatalog.addBooks(livro, autor, ano);

        System.out.println(bookCatalog);

        sc.close();
    }
}
