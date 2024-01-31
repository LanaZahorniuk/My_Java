package org.example._2024_01_29;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FileOperationExamples {

    public static void main(String[] args) throws IOException {
        copyFileUsingFileStreams();
        copyFileUsingPath();
        copyFileUsingRandomAccessFile();


    }

    // Задание 1: Работа с классом File

    /**
     * Написать метод, который создает файл с именем
     * "example.txt" в текущей директории, затем считывает
     * этот файл с использованием FileInputStream и записывает
     * его содержимое в новый файл "copy_example.txt" с использованием FileOutputStream.
     */
    public static void copyFileUsingFileStreams() throws IOException, RuntimeException {
        File file = new File("example.txt");
        file.createNewFile();
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден");
        }
        FileInputStream reader = new FileInputStream("example.txt");
        FileOutputStream out = new FileOutputStream("copy_example.txt");
        reader.close();
        out.close();
        System.out.println("Done");
    }

    // Задание 2: Работа с классом Path

    /**
     * Написать метод, который использует Path и Files
     * для копирования файла "example.txt" в новый файл "copy_example_path.txt".
     * Проверить, существует ли файл "example.txt" перед копированием.
     */
    public static void copyFileUsingPath() throws IOException {
        File file = new File("example.txt");
        if (file.exists()) {
            Path path = Paths.get("example.txt");
            File file1 = new File("copy_example_path.txt");
            path.toFile().renameTo(file1);
            System.out.println("Done");
        } else {
            throw new IOException();
        }

    }

    // Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, читает первые 20 байт и записывает
     * их в новый файл "random_access_copy.txt".
     */
    public static void copyFileUsingRandomAccessFile() throws IOException {
RandomAccessFile file = new RandomAccessFile("copy_example.txt", "rw");
while (file.getFilePointer() != 20) {
    file.read();
    file.write("random_access_copy.txt".getBytes());
}
    }
}
