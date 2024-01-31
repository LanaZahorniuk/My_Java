package org.example._2024_01_22;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        //Прочитайте файл и посчитайте средний рейтинг всех стримов.
        // Запишите результат в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("//D:\\09052023\\Java Pro\\TeacherJava_new\\src\\main\\java\\org\\example\\_2024_01_22\\f.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("result_task_1.txt"))) {

            writer.write(String.valueOf(reader.lines()

                    .map(el -> el.split(", ")[1])
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .orElse(0.0)));


            System.out.println("!!!DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

