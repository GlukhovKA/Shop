package Entity;

public class Shop {
    public String name;
    public int timeOpen;
    public int timeClose;
    int bankAccount;
    int SalaryFund;

    public Shop(String name, int timeOpen, int timeClose) {
        this.name = name;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
    }

    public Boolean isOpen(){
        return true;
    }

}
