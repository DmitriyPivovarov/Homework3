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
        float f = (float) 27.12; // Idea выдает предупреждение о неиспользовании введенных переменных, однако я посчитал верным руководствоваться здесь принципом буквального толквания задачи, выражающемся в игнорировании нетребуемых задач
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

        System.out.println("На каждого ученика расчитано " + paperPerStudent + " листов бумаги.");

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

        System.out.println("За 20 минут машина произвела " + capacityPerTwentyMin + " штук бутылок.");
        System.out.println("За сутки машина произвела " + capacityPerDay + " штук бутылок.");
        System.out.println("За 3 дня минут машина произвела " + capacityPerThreeDays + " штук бутылок.");
        System.out.println("За 1 месяц (30 дней) машина произвела " + capacityPerMonth + " штук бутылок.");

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

        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски.");


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

        System.out.println("Вес спортзавтрака составляет " + totalGr + " грамм."); // текстовая составляющая не требовалась в задании, однако была добавлена для удобства проверки
        System.out.println("Вес спортзавтрака составляет " + totalKg + " килограмм."); // текстовая составляющая не требовалась в задании, однако была добавлена для удобства проверки
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte requiredWeightLossKg = 7;
        short gWeightLossPerDayTypeOne = 250;
        short gWeightLossPerDayTypeTwo = 500;

        short gPerKg = 1000;

        int requiredWeightLossG = requiredWeightLossKg * gPerKg;
        int requiredDaysTypeOne = requiredWeightLossG / gWeightLossPerDayTypeOne; // Мы не знаем будет ли число цельным, поэтому хочется поставить float, однако количество дней, выраженное дробным числом, выглядит, как минимум, некорректно
        int requiredDaysTypeTwo = requiredWeightLossG / gWeightLossPerDayTypeTwo; // Дробный результат можно было бы перевести в переменную типа цельных чисел (byte, short, int, long), однако это вызвало бы неоправданное увеличение строк в программе

        System.out.println("При потере 250 грамм в день потребуется " + requiredDaysTypeOne + " дней."); // задание требовало лишь текст, однако последний добавлен для удобства проверки
        System.out.println("При потере 500 грамм в день потребуется " + requiredDaysTypeTwo + " дней."); // задание требовало лишь текст, однако последний добавлен для удобства проверки

        byte typesAmount = 2;

        int averageDaysRequired = (requiredDaysTypeOne + requiredDaysTypeTwo) / typesAmount;

        System.out.println("В среднем, потребуется " + averageDaysRequired + " день.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mSalaryPerMonth = 67760;
        int dSalaryPerMonth = 83690;
        int kSalaryPerMonth = 76230;

        int requiredIncreasePercents = 10;

        int mSalaryRaise = mSalaryPerMonth / requiredIncreasePercents;
        int dSalaryRaise = dSalaryPerMonth / requiredIncreasePercents;
        int kSalaryRaise = kSalaryPerMonth / requiredIncreasePercents;

        byte monthsPerYear = 12;

        int mSalaryPerYear = mSalaryPerMonth * monthsPerYear;
        int dSalaryPerYear = dSalaryPerMonth * monthsPerYear;
        int kSalaryPerYear = kSalaryPerMonth * monthsPerYear;

        int mSalaryPerMonthWithRaise = mSalaryPerMonth + mSalaryRaise;
        int dSalaryPerMonthWithRaise = dSalaryPerMonth + dSalaryRaise;
        int kSalaryPerMonthWithRaise = kSalaryPerMonth + kSalaryRaise;

        int mSalaryPerYearWithRaise = mSalaryPerMonthWithRaise * monthsPerYear;
        int dSalaryPerYearWithRaise = dSalaryPerMonthWithRaise * monthsPerYear;
        int kSalaryPerYearWithRaise = kSalaryPerMonthWithRaise * monthsPerYear;

        int mSalaryDiff = mSalaryPerYearWithRaise - mSalaryPerYear;
        int dSalaryDiff = dSalaryPerYearWithRaise - dSalaryPerYear;
        int kSalaryDiff = kSalaryPerYearWithRaise - kSalaryPerYear;

        System.out.println("Маша теперь получает " + mSalaryPerMonthWithRaise + " рублей в месяц (" + mSalaryPerYearWithRaise + " рублей в год). Годовой доход вырос на " + mSalaryDiff + " рублей.");
        System.out.println("Денис теперь получает " + dSalaryPerMonthWithRaise + " рублей в месяц (" + dSalaryPerYearWithRaise + " рублей в год). Годовой доход вырос на " + dSalaryDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kSalaryPerMonthWithRaise + " рублей в месяц (" + kSalaryPerYearWithRaise + " рублей в год). Годовой доход вырос на " + kSalaryDiff + " рублей.");

    }
}