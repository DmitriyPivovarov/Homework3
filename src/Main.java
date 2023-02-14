public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int i = 1234563;
        byte b = 15;
        short s = 28000;
        long l = 800000000L;
        float f = 1.1f;
        double d = 123.14567852;

        System.out.println("Значение переменной 'i' c типом 'int' (целочисленные) равно " + i);
        System.out.println("Значение переменной 'b' с типом 'byte' (целочисленные) равно " + b);
        System.out.println("Значение переменной 's' с типом 'short' (целочисленные) равно " + s);
        System.out.println("Значение переменной 'l' с типом 'long' (целочисленные) равно " + l);
        System.out.println("Значение переменной 'f' с типом 'float' (c плавающей точкой) равно " + f);
        System.out.println("Значение переменной 'd' с типом 'double' (с плавающей точкой) равно " + d);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float f = (float) 27.12;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        short ss = -159;
        int i = 27897;
        byte b = 67;

        System.out.println("Задача 2 не указывает на необходимость выведения результата в консоль.");

    }
    public static void task3() {
        System.out.println("Задача 3");
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        int totalStudents = lpStudents + asStudents + eaStudents;
        short totalPaper = 480;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика расчитано " + paperPerStudent + " листов бумаги");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte twentyMinutes = 20;
        short day = 1440;
        short threeDays = 4320;
        int month = 43200;
        byte capacityPerTwoMin = 16;
        byte twoMinutes = 2;

        int capacityPerMinute = capacityPerTwoMin / twoMinutes;

        int capacityPerTwentyMin = capacityPerMinute * twentyMinutes;
        int capacityPerDay = capacityPerMinute * day;
        int capacityPerThreeDays = capacityPerMinute * threeDays;
        int capacityPerMonth = capacityPerMinute * month;

        System.out.println("За 20 минут машина произвела " + capacityPerTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacityPerDay + " штук бутылок");
        System.out.println("За 3 дня минут машина произвела " + capacityPerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц (30 дней) машина произвела " + capacityPerMonth + " штук бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalJars = 120;
        byte whiteJarsPerRoom = 2;
        byte brownJarsPerRoom = 4;

        int jarsPerRoom = whiteJarsPerRoom + brownJarsPerRoom;
        int totalRooms = totalJars / jarsPerRoom;
        int totalWhiteJars = whiteJarsPerRoom * totalRooms;
        int totalBrownJars = brownJarsPerRoom * totalRooms;

        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски");


    }
    public static void task6() {
        System.out.println("Задача 6");
        byte totalBananas = 5;
        byte grPerBanana = 80;
        short totalMilk = 200;
        byte grPerMilk = 105;
        byte totalIcecream = 2;
        byte grPerIcecream = 100;
        byte totalEggs = 4;
        byte grPerEgg = 70;

        int totalGrBananas = totalBananas * grPerBanana;
        int totalGrMilk = totalMilk * grPerMilk;
        int totalGrIcecream = totalIcecream * grPerIcecream;
        int totalGrEggs = totalEggs * grPerEgg;

        int totalGr = totalGrBananas + totalGrMilk + totalGrIcecream + totalGrEggs;
        int grPerKg = 1000;
        float totalKg = (float) totalGr / grPerKg;

        System.out.println("Вес спортзавтрака составляет " + totalGr + " грамм");
        System.out.println("Вес спортзавтрака составляет " + totalKg + " килограмм");


    }
}