package Enums;

public enum Unit {
    PIECE("шт."),
    GRAMS_100("100 гр."),
    GRAMS_1000("кг."),
    LITRE("л.");

    private String translation;

    Unit(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
