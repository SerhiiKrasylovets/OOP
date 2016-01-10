package enums;

public enum City {Kharkiv(2), Kyiv(3), Lviv(1);
    private int people;

    City(int p) {people = p;}

    int getPeople() {return people;}
}
