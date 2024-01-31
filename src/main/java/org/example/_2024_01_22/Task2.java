package org.example._2024_01_22;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        //Отфильтруйте стримы, имеющие рейтинг выше 4.5,
        // и запишите их в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\09052023\\Java Pro\\TeacherJava_new\\src\\main\\java\\org\\example\\_2024_01_22\\f.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("result_task_2.txt"))) {

            double a = 4.5;

            List<String> stringList = reader.lines()
                    .map(el -> el.split(", ")[1])
                    .mapToDouble(Double::parseDouble)
                    .filter(el -> el > a)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.toList());


            writer.write(String.join(", ", stringList));

            System.out.println("!!!DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

