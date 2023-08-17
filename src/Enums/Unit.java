package Enums;

/**
 * <b>Доступные ед. изм. товаров</b>:
 * {@link #PIECE},
 * {@link #GRAMS_1000},
 * {@link #LITRE}.
 * @author Glukhov K. A.
 * @version 0.0.2
 * @since 0.0.2
*/
public enum Unit {

    /** <b>Штука</b> */
    PIECE("шт."),

    /** <b>Килограмм</b> */
    GRAMS_1000("кг."),

    /** <b>Литр</b> */
    LITRE("л.");

    private final String translation;

    Unit(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
