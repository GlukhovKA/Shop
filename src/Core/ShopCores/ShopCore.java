package Core.ShopCores;


import Core.ShopCores.EmployeeWork;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * Класс <b>Логики работы магазина</b>.
 * @author MART 2023
 * @version 0.1.0
 * @since 0.1.0
 */
public class ShopCore implements Runnable{

    /** пул нитей(потоков)*/
    ExecutorService service = Executors.newFixedThreadPool(2);

    final Future<?> submitEmpl = service.submit(new EmployeeWork());

    final Future<?> submitCash = service.submit(new ControlCash());


    @Override
    public void run() {
        //
        Date date = new Date();

        // Форматы вывода времени (Часы, минуты, секунды)
        SimpleDateFormat formatForTimeH = new SimpleDateFormat("HH");
        SimpleDateFormat formatForTimeM = new SimpleDateFormat("mm");
        SimpleDateFormat formatForTimeS = new SimpleDateFormat("ss");

        // Сохранение времени запуска потока
        int startTime= (Integer.parseInt(formatForTimeH.format(date)) * 60) + Integer.parseInt(formatForTimeM.format(date)) + 1;
        // Вывод времени запуска потока
        System.out.println("Время старта: " + Integer.parseInt(formatForTimeH.format(date)) + ":" + Integer.parseInt(formatForTimeM.format(date)));

        // Объявление пула нитей с заданным размером
        // у ScheduledExecutorService есть задержка перед запуском нити и периодичность выполнения.
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        // Объявление нитей и добавление их в service (В пул нитей)
        final Future<?> submitEmpl = service.scheduleAtFixedRate(new EmployeeWork(), 0, 5, TimeUnit.SECONDS);
        final Future<?> submitCash = service.scheduleAtFixedRate(new ControlCash(), 0, 5, TimeUnit.SECONDS);

        // Создаем и добавляем нить ВРЕМЕНИ и добавляем в наш пул
        service.scheduleAtFixedRate(new Runnable() {
            public void run() {
                Date date1 = new Date();
                if (((Integer.parseInt(formatForTimeH.format(date1)) * 60) +
                        Integer.parseInt(formatForTimeM.format(date1))) >= startTime){

                    System.out.println("Выход");
                    service.shutdown();
                    //service.shutdownNow();
                    //System.exit(130);
                }else {
                    System.out.println("Время сейчас: " +Integer.parseInt(formatForTimeH.format(date1))
                            + ":" + Integer.parseInt(formatForTimeM.format(date1))  + ":" + Integer.parseInt(formatForTimeS.format(date1)));
                }
            }
        }, 5, 5, TimeUnit.SECONDS);
    }
}
