public class Main {
    public static void main(String[] args) {

        // задача  1
        byte a = 25;
        short b = 236;
        int c = 423;
        long d = 852L;
        float f = 2.56F;
        double g = 36.254;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);

        // задача 2
        byte da = 2;
        byte ta = 67;
        short db = 786;
        int dc = 27897;
        long dd = 987_678_965_549L;
        float df = 27.12F;
        double nb = -159;
        boolean dg = false;
        int tb = 569;
        System.out.println("Значение переменной da и ta с типом byte равно " + da + " и" + ta);
        System.out.println("Значение переменной db с типом short равно " + db);
        System.out.println("Значение переменной dc с типом int равно " + dc);
        System.out.println("Значение переменной dd с типом long равно " + dd);
        System.out.println("Значение переменной df с типом float равно " + df);
        System.out.println("Значение переменной nb с типом double равно " + nb);
        System.out.println("Значение переменной dg с типом boulean равно " + dg);
        System.out.println("Значение переменной tb с типом int равно " + tb);

        // задача 3
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int totalPaper = 480;
        int totalClass = (class1 + class2 + class3);
        int parerPersonal = totalPaper/totalClass;
        System.out.println("На каждого ученика рассчитано " + parerPersonal + " листов бумаги");

        // задача 4
        int bottle = 16;
        int performance = 2;
        int perfopmMinut = bottle/performance;
        int dayMinuts = 1440;
        int perform20Min = perfopmMinut * 20;
        int performDay = dayMinuts * perfopmMinut;
        int perform3Day = dayMinuts * 3 * perfopmMinut;
        int performMonth = dayMinuts * 30 * perfopmMinut;
        System.out.println("За 20 минут машина произвела бутылок " + perform20Min + " штук");
        System.out.println("За сутки машина произвела бутылок " + performDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + perform3Day + " штук");
        System.out.println("За месяц машина произвела бутылок " + performMonth + " штук");

        // задача 5
        int totalPaint = 120;
        int whitePaintClass = 2;
        int brownPaintClass = 4;
        int classTotal = totalPaint/(whitePaintClass + brownPaintClass);
        int totalWhite = classTotal * whitePaintClass;
        int totalBrown = classTotal * brownPaintClass;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // задача 6
        int bananas = 5;
        int bananasWeight = 80;
        int milk = 200;
        float milkWeight1g = 1.05f;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        float totalWeightRecipt = bananas * bananasWeight + milk * milkWeight1g + iceCream * iceCreamWeight + egg * eggWeight;
        float totalWeightKg = totalWeightRecipt / 1000f;
        System.out.println("Вес готового коктейля " + totalWeightRecipt + " грамм или " + totalWeightKg + " килограмм");

        // задача 7
        int weightLostKg = 7;
        int weightLostG = weightLostKg * 1000;
        int weightMinG = 250;
        int weightMaxG = 500;
        int weightOptimG = (weightMinG + weightMaxG)/2;
        int dayMin = weightLostG / weightMaxG;
        int dayMax = weightLostG / weightMinG;
        int dayOptim = weightLostG / weightOptimG;
        System.out.println("Для снижения веса на " + weightLostKg + " кг потребуется минимум " + dayMin + " дней по " + weightMaxG + " грамм в день, максимум " +dayMax + " дней по " + weightMinG + " грамм в день, в среднем " + dayOptim + " дней по " + weightOptimG + " грамм в день");

        // задача 8
        double salaryMary = 67760;
        double salaryDen = 83690;
        double salaryKris = 76230;
        double salaryMaryNew = salaryMary * 1.1;
        double salaryDenNew = salaryDen * 1.1;
        double salaryKrisNew = salaryKris * 1.1;
        double salaryMaryYear = salaryMaryNew * 12 - salaryMary * 12;
        double salaryDenYear = salaryDenNew * 12 - salaryDen * 12;
        double salaryKrisYear = salaryKrisNew * 12 - salaryKris * 12;
        System.out.println("Новая зарплата Марии " + salaryMaryNew + " рублей в месяц. Годовой доход вырос на " + salaryMaryYear + " рублей");
        System.out.println("Новая зарплата Дениса " + salaryDenNew + " рублей в месяц. Годовой доход вырос на " + salaryDenYear + " рублей");
        System.out.println("Новая зарплата Кристины " + salaryKrisNew + " рублей в месяц. Годовой доход вырос на " + salaryKrisYear + " рублей");

    }
}
