package day06.language;

public class Translator {
    public static void main(String[] args) {

        //Language obj = new Language(); //cannot create objects of interface

        Spanish spanish = new Spanish();

        spanish.hi();
        spanish.bye();

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();

        System.out.println(Language.PLANET);



    }
}

