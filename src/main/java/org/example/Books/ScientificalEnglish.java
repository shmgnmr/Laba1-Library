package org.example.Books;

public class ScientificalEnglish extends ScientificalBook {

    public ScientificalEnglish(String title) {
        super(title);
    }

    @Override
    public String getFullDiscription() {
        return super.getFullDiscription();
    }

    private static final String[] levelList = {"Bachelor's Degree","Master's Degree","Postgraduate Degree","Specialist Degree"};
    private static final String[] typeList = {"Textbook","Task Book", "Monograph", "Manual"};
    private static final String[] authorList = {"Salman Aslam","Linus Torvalds","Guido van Rossum","James Gosling","Jeff Dean","Bjarne Stroustrup","Anders Hejlsberg","Tim Berners-Lee"};
    private static final String[] disciplineList = {" Functional programming", " Discrete mathematics"," Algorithms and data structures"," Artificial intelligence"," Computer graphics"," Computer architecture"," Machine learning"," Lambda calculus and types"," Computational game theory"," Graph representational learning"};

    public static String[] getTypeList() {
        return typeList;
    }

    public static String[] getLevelList() {
        return levelList;
    }

    public static String[] getDisciplineList() {
        return disciplineList;
    }

    public static String[] getAuthorList() {
        return authorList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
