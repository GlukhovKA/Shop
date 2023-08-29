package Core.ShopCores;


import Core.ShopCores.EmployeeWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Класс <b>Логики работы магазина</b>.
 * @author MART 2023
 * @version 0.1.0
 * @since 0.1.0
 */
public class ShopCore {

    /** пул нитей(потоков)*/
    ExecutorService service = Executors.newFixedThreadPool(2);

    final Future<?> submitEmpl = service.submit(new EmployeeWork());

    final Future<?> submitCash = service.submit(new ControlCash());


}
