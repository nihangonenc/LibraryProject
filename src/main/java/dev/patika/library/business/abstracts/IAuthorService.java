package dev.patika.library.business.abstracts;

import dev.patika.library.entities.Author;
import org.springframework.data.domain.Page;

public interface IAuthorService {
    Author get(int id);
    Author save(Author author);
    Author update(Author author);
    Page<Author> cursor(int page, int pageSize);
    boolean delete(int id);
}
