package Enums;

public enum Category {
    DAIRY("Молочная продукция"),
    FRUITS_VEGETABLES("Фрукты/Овощи"),
    MEAT("Мясо"),
    FISH_SEAFOOD("Рыба/Морепродукты"),
    BREAD("Хлеб"),
    GROCERY("Бакалея");

    private String translation;

    Category(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
