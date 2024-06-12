package dev.patika.library.dto.response.bookBorrowing;

import dev.patika.library.entities.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingResponse {
    private String borrowerName;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private int bookId;
}