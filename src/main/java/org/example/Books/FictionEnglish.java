package org.example.Books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FictionEnglish extends FictionBook {
    private static List<String> titles;
    private static Random random = new Random();

    static {
        try {
            // Используем ClassLoader для чтения файла из ресурсов
            InputStream inputStream = FictionEnglish.class.getClassLoader().getResourceAsStream("Fiction_English.txt");
            if (inputStream != null) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                    titles = reader.lines().collect(Collectors.toList());
                }
            } else {
                throw new IOException("File not found: Books/Fiction_English.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
            titles = List.of("Untitled");
        }
    }

    public FictionEnglish() {
        super(getRandomTitle());
    }

    private static String getRandomTitle() {
        int index = random.nextInt(titles.size());
        return titles.get(index);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
