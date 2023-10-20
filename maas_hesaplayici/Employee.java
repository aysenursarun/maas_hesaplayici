package maas_hesaplayici;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {

		if (salary > 1000) {
			return salary * 0.03;
		} else {
			return 0;
		}
	}

	double bonus() {
		if (workHours > 40) {
			int prim = workHours - 40;
			return prim * 30;
		} else {
			return 0;
		}
	}

	double raiseSalary() {
		int toplamYıl = 2021 - hireYear;
		if (toplamYıl < 10) {
			return salary * 0.05;
		} else if (toplamYıl > 9 && toplamYıl < 20) {
			return salary * 0.10;
		} else {
			return salary * 0.15;
		}

	}
	
	public String toString() {
		double toplamMaas = salary + bonus() + raiseSalary() - tax();
		return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (toplamMaas - raiseSalary()) +
                "\nToplam Maaş: " + toplamMaas;
 	}
}
