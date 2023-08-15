package Enums;

public enum SkillType {
    CASHIER("Кассир"),
    MERCHANDISER("Мерчендайзер"),
    LOADER("Грузчик");

    private String translation;

    SkillType(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
