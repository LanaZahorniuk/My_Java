package org.example._2023_11_29;
/*
    Maintainable (Обслуживаемый)
        Методы:
            void repairItem()
            void updateItemCondition(ItemCondition condition)
            ItemCondition checkCondition()
 */
public interface Maintainable {
    void repairItem();
    void updateItemCondition(BookStatus condition);
    BookStatus checkCondition();
}
