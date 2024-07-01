package org.example.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookFactory {
    private Random random = new Random();
    private List<Book> books = new ArrayList<>();

    public List<Book> generateBooks() {
        generateFictionBooks("Russian", 30);
        generateFictionBooks("English", 30);
        generateScientificalBooks("Russian", 30);
        generateScientificalBooks("English", 30);
        return books;
    }

    private void generateFictionBooks(String language, int count) {
        for (int i = 0; i < count; i++) {
            FictionBook book = createFictionBook(language);
            books.add(book);
        }
    }

    private void generateScientificalBooks(String language, int count) {
        for (int i = 0; i < count; i++) {
            ScientificalBook book = createScientificalBook(language);
            books.add(book);
        }
    }

    public ScientificalBook createScientificalBook(String language) {
        if (language.equals("Russian")){
            int index = random.nextInt(ScientificalRussian.getDisciplineList().length);
            int indexx = random.nextInt(ScientificalRussian.getAuthorList().length);
            int indexxx = random.nextInt(ScientificalRussian.getTypeList().length);
            String title = ScientificalRussian.getDisciplineList()[index] + " " + ScientificalRussian.getAuthorList()[indexx] + " " + ScientificalRussian.getTypeList()[indexxx];
            return new ScientificalRussian(title);
        }
        else {
            int ind = random.nextInt(ScientificalEnglish.getLevelList().length);
            int index = random.nextInt(ScientificalEnglish.getDisciplineList().length);
            int indexx = random.nextInt(ScientificalEnglish.getAuthorList().length);
            int indexxx = random.nextInt(ScientificalEnglish.getTypeList().length);
            String title = ScientificalEnglish.getLevelList()[ind] + ScientificalEnglish.getDisciplineList()[index] + " " + ScientificalEnglish.getAuthorList()[indexx] + " " + ScientificalEnglish.getTypeList()[indexxx];
            return new ScientificalEnglish(title);
        }
    }

    public FictionBook createFictionBook(String language) {
        if (language.equals("Russian")) {
            return new FictionRussian();
        }
        else {
            return new FictionEnglish();
    }}
}
