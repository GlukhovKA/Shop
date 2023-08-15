package Entity;

/**
 * Класс <b>Человек</b> с параметрами: <b>fullName</b> и <b>cash</b>.
 * @author Glukhov K. A.
 * @version 0.0.2
 * @since 0.0.2
*/
public class Human {

    /** Параметр <b>ФИО</b> */
    String fullName;

    /** Параметр <b>Деньги</b> */
    private int cash;

    /**
     * Конструктор - создание экземпляра класса <b>Человек</b>
     * @param fullName 'Фамилия Имя Отчество'
    */
    public Human(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Функция получения значения параметра {@link Human#fullName}
     * @return состояние банковского счета
    */
    public String getFullName() {
        return fullName;
    }

    /**
     * Функция получения значения параметра {@link Human#cash}
     * @return соостояние банковского счета
    */
    public int getCash() {
        return cash;
    }

    /**
     * Процедура присваивания значения параметру {@link Human#cash}
     * @param cash сумма денег
    */
    public void setCash(int cash) {
        this.cash = cash;
    }
}
