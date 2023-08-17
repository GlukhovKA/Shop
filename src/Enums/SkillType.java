package Enums;

/**
 * <b>Доступные категории навыков</b>:
 * {@link #CASHIER},
 * {@link #MERCHANDISER},
 * {@link #LOADER}.
 * @author Glukhov K. A.
 * @version 0.0.2
 * @since 0.0.2
*/
public enum SkillType {

    /** <b>Кассир</b> */
    CASHIER("Кассир"),

    /** <b>Мерчендайзер</b> */
    MERCHANDISER("Мерчендайзер"),

    /** <b>Грузчик</b> */
    LOADER("Грузчик");

    private final String translation;

    SkillType(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
