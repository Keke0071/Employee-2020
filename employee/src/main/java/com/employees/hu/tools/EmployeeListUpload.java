package com.employees.hu.tools;

public class EmployeeListUpload {
    private static String[] id;
    private static String[] Name;
    private static String[] age;
    private static String[] Salary;
    private static String[] Position;


    public EmployeeListUpload() {
    }

    public static void init() {
        Name = new String[]{"ALex", "Attila", "Balázs", "Bence", "Benedek", "Csaba", "Dániel", "Dénes", "Erik", "Gergely", "István", "Imre", "Károly", "Máté", "Norbert", "Zalán", "Adrien", "Bernadett", "Bianka", "Csenge", "Dalma", "Dorka", "Eszter", "Kinga", "Nikolett", "Petra"};
        Position = new String[]{"Vezető", "Tervező", "Grafikus", "Fejlesztő", "Tesztelő"};

    }

    public static int getid() {
        return getRandomInt(1, 999999) ;
    }

    public static String getName() {
        return Name[getRandomInt(0, Name.length)] + " " + Name[getRandomInt(0, Name.length)];
    }

    public static int getAge() {
        return getRandomInt(18, 62) ;
    }

    public static int getSalary() {
        return getRandomInt(120000, 375000) ;
    }

    private static int getRandomInt(int min, int max) {
        return min + (int)(Math.random() * (double)(max - min));
    }
}