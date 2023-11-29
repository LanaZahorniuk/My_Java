package org.example._2023_11_29;

import java.time.LocalDate;

/*
    Magazine (Журнал) Реализует: LibraryItem
        Поля:
            int issueNumber
            LocalDate releaseDate
            boolean isMonthly
 */
public class Magazine extends LibraryItem{
    public int issueNumber;
    public LocalDate releaseDate;
    public boolean isMonthly;
}
