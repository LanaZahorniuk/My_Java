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

    public Magazine(String title, String author, Genre genre, int issueNumber, LocalDate releaseDate, boolean isMonthly) {
        super(title, author, genre);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
        this.isMonthly = isMonthly;
    }

    @Override
    public String toString() {
        return "issueNumber: " + issueNumber +
                ", releaseDate: " + releaseDate +
                ", isMonthly: " + isMonthly +
                ", title: " + title +
                ", author: " + author+
                ", genre: " + genre;
    }
}
