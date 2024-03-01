public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        return (this.salary < 1000) ? 0 : (this.salary * 0.03);
    }

    double bonus() {
        return (this.workHours > 40) ? (this.workHours - 40) * 30 : 0;
    }

    double raiseSalary() {
        int years = 2021 - this.hireYear;
        if ((years) < 10) {
            return salary * 0.05;
        } else if (years > 19) {
            return salary * 0.15;
        } else {
            return salary * 0.1;
        }
    }

    public String toString() {
        return "\nAdı : " + this.name + "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nİşe Başlangıç Yılı : " + this.hireYear +
                "\nVergi : " + this.tax() + "\nBonus : " + this.bonus() +
                "\nMaaş Artışı : " + this.raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary - this.tax() + this.bonus()) +
                "\nToplam Maaş : " + (this.salary - this.tax() + this.bonus() + this.raiseSalary());
    }

}
