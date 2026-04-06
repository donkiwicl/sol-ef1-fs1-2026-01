package dev.donwiki.caseone.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int Id;
    private String Name;
    private String Category;
    private int price;
}
