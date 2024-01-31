package org.example._2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStream {
    /**
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     * * //     * -- Отфильтровать на четные или не четные
     * * //     * -- Просуммировать все числа
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> even = numbers.stream()
                .filter(el -> el % 2 == 0)
                .reduce(Integer::sum);
        System.out.println(even.stream().toList());

        /**  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         * //
         * //     * -- Найти суммы чисел кратных 3 и 5
         */

        Stream<Integer> num = numbers.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0);
        System.out.println(num.toList());

        /** List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     *  * -- Получить среднее значение
     */
//        Stream<Integer> sum = numbers.stream()
//                .collect(Collectors.averagingInt(Integer::sum));
//        System.out.println(sum);
    }

}
