package Enums;

/**
 * <b>Доступные категории товаров</b>:
 * {@link #DAIRY},
 * {@link #FRUITS_VEGETABLES},
 * {@link #MEAT},
 * {@link #FISH_SEAFOOD},
 * {@link #BREAD},
 * {@link #GROCERY}.
 * @author Glukhov K. A.
 * @version 0.0.1
 * @since 0.0.1
*/
public enum Category {

    /** <b>Молочная продукция</b> */
    DAIRY("Молочная продукция"),

    /** <b>Фрукты/Овощи</b> */
    FRUITS_VEGETABLES("Фрукты/Овощи"),

    /** <b>Мясо</b> */
    MEAT("Мясо"),

    /** <b>Рыба/Морепродукты</b> */
    FISH_SEAFOOD("Рыба/Морепродукты"),

    /** <b>Хлеб</b> */
    BREAD("Хлеб"),

    /** <b>Бакалея</b> */
    GROCERY("Бакалея");

    private final String translation;

    Category(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
