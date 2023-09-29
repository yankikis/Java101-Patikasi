package Metotlar.MaasHesaplayanProgram;

public class Employee {
    String name;
    int salary;
    int workHour;
    int hireYear;

    Employee(String name, int salary, int workHour, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary < 1000){
            return 0;
        }
        else{
            return (double)this.salary * 0.03;
        }
    }
    int bonus(){
        if (this.workHour > 40){
            return (this.workHour-40) *30;
        }
        return 0;
    }
    double raiseSalary(){
        int year = 2021-this.hireYear;
        if (year < 10){
            return this.salary * 0.05;
        }
        else if (year > 9 && year < 20){
            return this.salary * 0.1;
        }
        return this.salary * 0.15;
    }
    public String toString(){
        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHour +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : "+ raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()) +
                "\nNet Maaşı : " + (this.salary + raiseSalary());
    }
}
