package dev.donwiki.caseone.dev.donkiwi.caseone.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @NotNull(message="Debe incluirse un identificador unico")
    private int Id;
    @NotBlank(message="Debe asignarse un nombre")
    private String Name;
    @NotBlank(message="Debe asignarse una categoria")
    private String Category;
    @NotNull(message="Debe indicarse un valor referencial")
    private int price;
}
