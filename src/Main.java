public class Main {
    public static void main(String[] args) {

        int studentsOfClass1 = 23;
        int studentsOfClass2 = 27;
        int studentsOfClass3 = 30;
        int totalSheets = 480;

        int totalStudent = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;

        int sheetsPerStudent = totalSheets / totalStudent;
        System.out.println(sheetsPerStudent);

        int boottlesInMinutes = 16;
        int minutesInDay = 24 * 60;
        int minutesInTree = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = boottlesInMinutes * 20;
        int bottlesInDay = boottlesInMinutes * minutesInDay;
        int bottlesInTreeDay = boottlesInMinutes * minutesInTree;
        int bottlesInMonth = boottlesInMinutes * minutesInMonth;

        System.out.println("20 минут: " + bottlesIn20Minutes);
        System.out.println("за день: " + bottlesInDay);
        System.out.println("за 3 дня: " + bottlesInTreeDay);
        System.out.println("за месяц: " + bottlesInMonth);

        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalCans * whiteCansPerClass;
        int totalBrownCans = totalCans * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски " + totalBrownCans + " банок коричневой");

        int bananasCount = 5;
        int bananasWeight = 80;
        int milkVolume = 200;
        double iceCreamWeight = 2 * 100;
        int eggsCount = 4;
        int eggsWeight = 70;

        int totalWightGr = bananasCount * bananasWeight + milkVolume * 105 / 100 + (int) iceCreamWeight + eggsCount * eggsWeight;
        double totalWeightInKg = totalWightGr / 1000.0;

        System.out.printf("Общий вес завтрака: %d грамм (%.2f кг), ", totalWightGr, totalWeightInKg);

        int weightLossGoalKg = 7;
        double dailyWeightLossLowKg = 0.25;
        double dailyWeightLossHighKg = 0.5;

        int daysLow = (int) Math.ceil(weightLossGoalKg / dailyWeightLossLowKg);
        int daysHigh = (int) Math.ceil(weightLossGoalKg / dailyWeightLossHighKg);
        int daysAverage = (daysLow + daysHigh) / 2;

        System.out.println("Теряем в день:" + dailyWeightLossLowKg + " Нужно дней:" + daysLow);
        System.out.println("Теряем в день:" + dailyWeightLossHighKg + " нужно дней:" + daysHigh);
        System.out.println("Среднее количество дней:" + daysAverage);

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);

        int mashaSalaryBeforeIndexation = mashaSalary * 12;
        int denisSalaryBeforeIndexation = denisSalary * 12;
        int kristinaSalaryBeforeIndexation = kristinaSalary * 12;

        int mashaSalaryAfterIndexation = mashaNewSalary * 12;
        int denisSalaryAfterIndexation = denisNewSalary * 12;
        int kristinaSalaryAfterIndexation = kristinaNewSalary * 12;

        System.out.println("Маша теперь получает:" + mashaNewSalary + ". Доход вырос на:" + (mashaSalaryAfterIndexation - mashaSalaryBeforeIndexation));
        System.out.println("Денис теперь получает:" + denisNewSalary + ". Доход вырос на:" + (denisSalaryAfterIndexation - denisSalaryBeforeIndexation));
        System.out.println("Кристина теперь получает:" + kristinaNewSalary + ". Доход вырос на:" + (kristinaSalaryAfterIndexation - kristinaSalaryBeforeIndexation));
    }
}