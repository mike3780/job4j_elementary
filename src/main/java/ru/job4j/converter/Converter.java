package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rub = 140;
        float euro = Converter.rubleToEuro(rub);
        float dollar = Converter.rubleToDollar(rub);
        System.out.println(rub + " rubles are " + euro + " euro.");
        System.out.println(rub + " rubles are " + dollar + " dollar.");
        float inToEuro = 140;
        float inToDollar = 120;
        float expected = 2;
        float outToEuro = Converter.rubleToEuro(inToEuro);
        float outToDollar = Converter.rubleToDollar(inToDollar);
        boolean passedToEuro = expected == outToEuro;
        boolean passedToDollar = expected == outToDollar;
        System.out.println("140 rubles are 2. Test result : " + passedToEuro);
        System.out.println("120 rubles are 2. Test result : " + passedToDollar);
    }
}
