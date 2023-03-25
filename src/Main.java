public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1");
        Book theShining =  new Book ("С. Кинг", "Сияние");
        System.out.println("theShining.Author = " + theShining.getAuthor());
        System.out.println("theShining.nameBook = " + theShining.getNameBook());
        Author shining = new Author("Стивен Кинг", 1977);
        System.out.println("shining.name = " + shining.getName());
        System.out.println("shining.year = " + shining.getYear());
        System.out.println();

        System.out.println("Книга 2");
        Book theTintenhers = new Book("К. Фукне", "Чернильное сердце");
        System.out.println("theTintenhers.Author = " + theTintenhers.getAuthor());
        System.out.println("theTintenhers.nameBook = " + theTintenhers.getNameBook());
        Author tintenhers = new Author("Корнелия Фукне", 2003);
        System.out.println("tintenhers.name = " + tintenhers.getName());
        System.out.println("tintenhers.year = " + tintenhers.getYear());
        tintenhers.setYear(2005);
        System.out.println("tintenhers.getYear() = " + tintenhers.getYear());


    }

}