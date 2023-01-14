public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println(" Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        int totalAccumulation = 2459000;
        while (total <= 2459000) {
            month++;
            total = total + 15000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + "  рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2 ");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j);
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int totalPopulation = 12000000;
        int mortalityRate =8;
        int birthRate=17;
        int years=0;
        while (years< 10){
            years++;
            totalPopulation= totalPopulation+ (totalPopulation/1000*birthRate)-(totalPopulation/1000*mortalityRate);
            System.out.println("Год " + years + ", численность населения составляет " + totalPopulation);

        }
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        int deposit = 15000;
        int month = 0;
        while (deposit < 12000000) {
            month++;
            deposit = deposit + (deposit * 7 / 100);
            System.out.println("За " + month + " месяц  сумма накоплений  равна " + deposit);
        }


    }

    public static void task5() {
        System.out.println(" Задача 5");
        int deposit = 15000;
        int month = 0;
        while (deposit < 12000000) {
            month++;
            deposit = deposit + (deposit * 7 / 100);
            if (month % 6 == 0) {
                System.out.println(" За " + month + " месяц сумма накоплений равна " + deposit);
            }
        }
        System.out.println(deposit);
    }

    public static void task6() {
        System.out.println(" Задача 6 ");
        int deposit = 15000;
        int month = 0;
        while (month < 108) {
            month++;
            deposit = deposit + (deposit * 7 / 100);
            if (month % 6 == 0) {
                System.out.println(" Сумма накоплений за " + month + " месяц равна " + deposit + " равна ");
            }
        }

        System.out.println(" за 9 лет сумма накоплений составит " + deposit);

    }

    public static void task7() {
        System.out.println(" Задача 7 ");
        int date = 6;
        while (date <= 31) {
            date = date + 7;
            System.out.println(" Сегодня пятница , " + date + " число. Необходимо подготовить отчет");

        }

    }

    public static void task8() {

        System.out.println(" Задача 8");
        int year = 1823;
        for (; year < 2123; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

    }

}


