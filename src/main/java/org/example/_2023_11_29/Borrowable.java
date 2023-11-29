package org.example._2023_11_29;
/*
- Интерфейсы:
    Borrowable (Заимствуемый)
        Методы:
            void borrowItem(User user)
            void returnItem(User user)
            boolean isAvailable()
 */
public interface Borrowable {
    void borrowItem (User user) ;

    void returnItem(User user) ;

    boolean isAvailable();


}
