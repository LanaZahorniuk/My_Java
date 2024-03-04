//package org.example._2024_01_31.taski;
//
//
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class UniversityProcessor {
//    public static void main(String[] args) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
//        FileReader reader = new FileReader("D:\\09052023\\Java Pro\\My_Java\\src\\main\\resources\\1.yaml");
//        UniversityContainer container = objectMapper.readValue(reader, UniversityContainer.class);
//
//
//        List<Course> courseList = getAllCourses(container.getUniversity());
//        System.out.println(courseList);
//    }
//
//    // 1. Получить список всех курсов в университете
//    public static List<Course> getAllCourses(University university) {
//        return university.getDepartments().stream()
//                .flatMap(el -> el.getCourses().stream())
//                .toList();
//    }
//
//
//    // 2. Найти количество курсов в каждом департаменте
//    public Map<String, Long> getCoursesCountByDepartment(University university) {
//        return null;
//    }
//
//    // 3. Получить список названий всех курсов, которые имеют более 3 кредитов
//    public List<String> getCoursesWithMoreThanThreeCredits(University university) {
//        return null;
//    }
//
//    // 4. Найти всех профессоров, которые ведут более одного курса
//    public Set<String> getProfessorsTeachingMultipleCourses(University university) {
//        return null;
//    }
//
//    // 5. Получить мапу курсов, где ключ - название курса, значение - список тем
//    public Map<String, List<String>> getCourseTopicsMap(University university) {
//        return null;
//    }
//
//    // 6. Найти департаменты, где все курсы имеют более 3 кредитов
//    public List<String> getDepartmentsWithAllCoursesMoreThanThreeCredits(University university) {
//        return null;
//    }
//
//    // 7. Получить список курсов, сгруппированных по количеству кредитов
//    public Map<Integer, List<Course>> getCoursesGroupedByCredits(University university) {
//        return null;
//    }
//
//    // 8. Найти департамент с самым большим количеством курсов
//    public String getDepartmentWithMostCourses(University university) {
//        return null;
//    }
//
//    // 9. Получить мапу, где ключ - название департамента, а значение - среднее количество кредитов курсов в департаменте
//    public Map<String, Double> getAverageCreditsPerDepartment(University university) {
//        return null;
//    }
//
//    // 10. Найти курсы, у которых более 2 тем и профессор начинается на 'Dr.'
//    public List<Course> getCoursesWithMoreThanTwoTopicsAndDrProfessor(University university) {
//        return null;
//    }
//}
