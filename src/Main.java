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
} public static void task1(){
    System.out.println(" Задача 1");
    int deposit= 15000;
    int total=0;
    int month=0;
    int totalAccumulation = 2459000;
    while (total <=2459000) {
        month++;
        total=total+15000;
        System.out.println("Месяц " + month + " сумма накоплений равна " + total + "  рублей");
    }

    } public static void task2(){
        System.out.println("Задача 2 ");
        int j =0;
        while (j < 10 ){
         j++;
         System.out.print( j );
        }
        System.out.println();
        for (int i=10; i > 0; i --){
        System.out.print ( i );
    }
       System.out.println();
} public static void task3(){
   System.out.println(" Задача 3 ");
   int totalPopulation = 12000000;
   int birthRate =17;
   int futureYears=0;
   int mortalityRate =8;
   while (futureYears < 10) {
       futureYears++;
       totalPopulation=totalPopulation+9*12;
       System.out.println("Год " + futureYears +  " численность населения " + totalPopulation+ " составляет" );

    }
} public static void task4(){
   System.out.println(" Задача 4 ");
   int deposit =15000;
   int month=0;
   while (month<99){
       month++;
       deposit=deposit+(deposit*7/100);
       System.out.println(" Сумма накоплений за " + month + "месяц равна "+ deposit + " равна" );

   }


    } public static void task5(){
      System.out.println(" Задача 5");
      int deposit =15000;
      int month=0;
      while (month <99){
       month++;
       deposit =deposit+(deposit*7/100);
       if (month % 6 == 0){
        System.out.println(" Сумма накоплений за " + month + " месяц равна " + deposit + " равна ");
      }
      }
      System.out.println(deposit);
      }public static void task6(){
        System.out.println(" Задача 6 ");
        int deposit=15000;
        int month=0;
        while (month <108){
            month++;
            deposit =deposit+(deposit*7/100);
            if(month % 6 == 0){
                System.out.println(" Сумма накоплений за " + month + " месяц равна " + deposit + " равна ");
            }
        }

        System.out.println(" за 9 лет сумма накоплений составит " + deposit);

         } public static void task7(){
          System.out.println(" Задача 7 ");
          int data = 3;
          int friday=0;
          while(friday<4){
           friday++;
           data++;
           System.out.println(" Сегодня пятница, " + data+ " число. Необходимо подготовить отчет");

          }
    }public static void task8(){

        System.out.println(" Задача 8");
        int year=1823;
        for (;year<2123; year++){
            if(year % 79 == 0){
                System.out.println(year);
            }
        }

        }

    }


