package dev.patika.library.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {
    @Positive(message = "ID pozitif sayı olmak zorunda")
    private int id;
    @NotNull(message = "Kategori ismi boş olamaz")
    private String name;
    @NotNull(message = "Açıklama kısmı boş olamaz")
    private String description;
}
