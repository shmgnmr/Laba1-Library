package org.example.Books;

public class ScientificalRussian extends ScientificalBook {

    public ScientificalRussian(String title) {
        super(title);
    }

    @Override
    public String getFullDiscription() {
        return super.getFullDiscription();
    }

    private static final String[] typeList = {"Учебник","Пособие","Задачник","Рабочая тетрадь","Учебное пособие","Монография"};
    private static final String[] authorList = {"Клетеник Д. В.", "Демидович Б. П.", "Фомин О.Ю.", "Парфёнова М. Д", "Сандаков Е. Б.", "Горячев А. П."};
    private static final String[] disciplineList = {"Линейная алгебра", "Аналитическая геометрия", "Математическая статистика", "Экономико-математическое моделирование", "Экономичсекая история", "Микроэкономика", "Международные финансы", "Базы данных"};

    public static String[] getAuthorList() {
        return authorList;
    }

    public static String[] getDisciplineList() {
        return disciplineList;
    }

    public static String[] getTypeList() {
        return typeList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
