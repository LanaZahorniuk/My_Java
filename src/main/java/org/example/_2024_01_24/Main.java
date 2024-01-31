package org.example._2024_01_24;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    /**
     * Создайте объекты класса Book для каждой строки.
     * Используйте Stream API для преобразования строк в объекты.
     * Сериализуйте список книг в файл с использованием ObjectOutputStream.
     */
    public static void main(String[] args) throws RuntimeException {
        try (BufferedReader reader = new BufferedReader(new FileReader("taski.txt"));
             ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("books.ser"))) {

            List<Book> books = reader.lines()
                    //.map(e -> new Book(Integer.parseInt(e.split(", ")[0]), e.split(", ")[1], e.split(", ")[2]
                    //, Integer.parseInt(e.split(", ")[3]), Double.parseDouble(e.split(", ")[4])))
                    .map(line -> line.split(", "))
                    .map(book -> new Book(Integer.parseInt(book[0]), book[1], book[2], Integer.parseInt(book[3]), Double.parseDouble(book[4])))
                    .toList();
            outputStream.writeObject(books);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class Main1 {

    /**
     * Десериализуйте список книг из файла,
     * созданного в предыдущем задании, используя ObjectInputStream.
     * Используйте Stream API для фильтрации книг, например, по автору или году издания.
     * Результаты сохраните в новый сериализованный файл
     */
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("books.ser"));
             ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("filter_books.ser"))) {
            List<Book> list = (List<Book>) inputStream.readObject();
            outputStream.writeObject(list.stream()
                    .filter(el -> el.getYear() > 1900)
                    .toList());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class Main2 {

    /**
     * Отфильтруйте книги с ценой выше определенной суммы. Сериализуйте отфильтрованный список книг в файл.
     */
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("books.ser"));
             ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("filter_books_price.ser"))) {
            List<Book> list = (List<Book>) inputStream.readObject();
            List<Book> fitefList = list.stream()
                    .filter(el -> el.getPrice() > 500)
                    .collect(Collectors.toList());
            outputStream.writeObject(fitefList);
            System.out.println(fitefList);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}


class Main3 {

    /**
     * Агрегируйте данные, например, подсчитайте среднюю цену книг по каждому автору. Сериализуйте результаты в файл.
     */
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("taski.txt");
             Scanner scanner = new Scanner(inputStream);
             ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("aggregation_book.ser"))) {
            Map<String, Double> authorAveragePrice = scanner.nextLine()
                    .lines()
                    .skip(0)
                    .map(el -> el.split(", "))
                    .filter(el -> el.length >= 5)
                    .collect(Collectors.groupingBy(el -> el[2], Collectors.averagingDouble(el -> Double.parseDouble(el[4]))));
            System.out.println(authorAveragePrice);
            outputStream.writeObject(authorAveragePrice);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
