package Homework.Task3_4;


public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    void paySalary() {
        int summ = balance + salary;
        setBalance(summ);
    }

    double withdraw(int summ) {
        double comission = 0;
        if (summ < 1000) {
            comission = summ * 0.05;
        } else {
            comission = summ * 0.1;
        }
        return comission;
    }

    void companyNameLengt() {
        System.out.println(getCompanyName().length());
    }

    void monthIncreaser(int addMonth) {
        int Increase = getMonthsOfEmployment() + addMonth;
        setMonthsOfEmployment(Increase);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
