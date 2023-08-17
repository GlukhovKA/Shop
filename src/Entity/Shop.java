package Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс <b>Магазин</b> с параметрами: <b>name</b>, <b>timeOpen</b>, <b>timeClose</b>,
 * <b>bankAccount</b> и <b>salaryFund</b>.
 * @author Glukhov K. A.
 * @version 0.0.2
 * @since 0.0.1
*/
public class Shop {

    /** Параметр <b>Название магазина</b> */
    public String name;

    /** Параметр <b>Время открытия магазина</b> */
    public int timeOpen;  //  8:00

    /** Параметр <b>Время закрытия магазина</b> */
    public int timeClose; // 22:00

    /** Параметр <b>Состояние банковского счета</b> */
    int bankAccount;

    /** Параметр <b>Зарплатный фонд магазина</b> */
    int salaryFund;

    /*--------------------------------------------------------------*/

    /**
     * Конструктор - создание экземпляра класса <b>Магазин</b>
     * @param name название магазина
     * @param timeOpen время открытия магазина
     * @param timeClose время закрытия магазина
    */
    public Shop(String name, int timeOpen, int timeClose) {
        this.name = name;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
    }

    /**
     * Функция получения значения параметра {@link Shop#bankAccount}
     * @return состояние банковского счета
    */
    public int getBankAccount() {
        return bankAccount;
    }

    /**
     * Функция получения значения параметра {@link Shop#salaryFund}
     * @return размер зарплатного фонда магазина
    */
    public int getSalaryFund() {
        return salaryFund;
    }

    /** Функция получения состояния магазина
     * @return true or false
    */
    public Boolean isOpen(){
        Date date = new Date();
        SimpleDateFormat formatForTime = new SimpleDateFormat("HH");
        return ((Integer.parseInt(formatForTime.format(date)) > timeOpen) & (Integer.parseInt(formatForTime.format(date)) < timeClose));
    }

}
