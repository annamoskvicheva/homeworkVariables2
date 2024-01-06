public class Main {
    public static void main(String[] args) {

        System.out.println("ЗАДАЧА 1");
        //Объявите переменные типа int, byte, short, long, float, double.
        //Название переменных может быть любым, но если состоит из двух слов и более,
        //должно соответствовать правилу camelCase.
        //Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        int cars = 3000000;
        System.out.println("Значение переменной cars с типом int равно " +cars);
        byte pen = 5;
        System.out.println("Значение переменной pen с типом byte равно " +pen);
        short lemon = 25000;
        System.out.println("Значение переменной lemon с типом short равно " +lemon);
        long stars = 260L;
        System.out.println("Значение переменной stars с типом long равно " +stars);
        float money = 7500.4589f;// 3 числа после запятой
        System.out.println("Значение переменной money с типом float равно " +money);
        double coint = 10500.56891790003679876546;// 12 чисел после запятой
        System.out.println("Значение переменной coint с типом coint равно " +coint);
        System.out.println("ЗАДАЧА 2");
        //Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        //Значения:
        //27.12
        //987 678 965 549
        //2,786
        //569
        //-159
        //27897
        //67
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        int k = 27897;
        byte l = 67;
        System.out.println("a = " +a+ ";b = "+ b+ ";c = "+c+";d = "+d+";e = "+e+"; k = "+k+"; l = "+l);
        System.out.println("ЗАДАЧА 3");
        //Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        //Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        //Для объявления переменных не используйте тип var.
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        int sheets =  480;
        int studentsAll = studentsLP + studentsAS + studentsEA;
        int sheetsEveryStudent = sheets / studentsAll;
        System.out.println("На каждого ученика рассситано " + sheetsEveryStudent+ " листов бумаги.");
        System.out.println("ЗАДАЧА 4");
        //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        //Какая производительность машины будет:
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц?
        //Рассчитывайте производительность работы машины в том случае,
        //если она работает без перерыва заданный промежуток времени.
        //Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        //Для объявления переменных не используйте тип var.
        final int MIN = 60; // в одной минуте  секунд
        final int HOUR = 3600; // в одном часе секунд
        final int BOTTlE_MIN = 8;
        int min2 = 2 * MIN;
        int bottle2Min = (BOTTlE_MIN * min2) / MIN;
        System.out.println("За 2 минуты машина произвела " + bottle2Min+  " штук бутылок.");
        int min20 = 20 * MIN;
        int bottle20Min = (BOTTlE_MIN * min20) / MIN;
        System.out.println("За 20 минут машина произвела " + bottle20Min+  " штук бутылок.");
        int hours24 = 24 * HOUR;
        int bottle24Hours = (BOTTlE_MIN * hours24) / MIN;
        System.out.println("За сутки (24 часа) машина произвела " + bottle24Hours+  " штук бутылок.");
        //первый вариант решения в 3днях, его использовала при решение в задачи
        int bottleDays3 = ((hours24 * 3) * BOTTlE_MIN) / MIN;
        System.out.println("За 3 дня машина произвела " + bottleDays3 +  " штук бутылок.");
        // второй париант решения в 3 днях
        //int bottle3Days2 = bottle24Hours * 3;
        //System.out.println("За 3 дня машина произвела " + bottle3Days2 +  " штук бутылок.");
        //первый вариант решения месяц, его использовала при решение в задачи
        int bottleMonth = ((hours24 * 30) * 8) / MIN;
        System.out.println("За месяц машина произвела " +bottleMonth +  " штук бутылок.");
        //второй вариант
        //int bottleMonth2 = bottle24Hours * 30;
        //System.out.println("За месяц машина произвела " + bottleMonth2 +  " штук бутылок.");
        System.out.println("ЗАДАЧА 5");
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        //На один класс уходит 2 банки белой и 4 банки коричневой краски.
        //Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски
        // и … банок коричневой краски».
        //Для объявления переменных не используйте тип var.
        int paintCans = 120; // всего банок
        byte cansWhite = 2; //белая краска
        byte cansBrow =4; //коричневая краска
        int cansPaintForOneClassroom = cansWhite + cansBrow; //количество всех банок для каждого класса
        int allClassroom = paintCans / cansPaintForOneClassroom; //сколько всего классов
        int allCansWhite = allClassroom * cansWhite; //сколько всего белой краски
        int allCansBrow = allClassroom * cansBrow; // сколько всего коричневой краски
        System.out.println("В школе, где "+ allClassroom+" классов, нужно "+allCansWhite+" банок белой краски и "
        +allCansBrow+" банок коричневой краски.");
        System.out.println("ЗАДАЧА 6");
        //Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        //Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        //Бананы — 5 штук (1 банан — 80 грамм).
        //Молоко — 200 мл (100 мл = 105 грамм).
        //Мороженое-пломбир — 2 брикета по 100 грамм.
        //Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        //Смешать всё в блендере — и готово.
        //Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        //Результат в граммах и килограммах напечатайте в консоль.
        byte banana1 = 80;
        int bananas5 = 5 * banana1;
        short milk100 = 105;
        int milk200 = milk100 + milk100; //операция + стоит дешевле, чем умножение
        short iceCream1 = 100;
        int iceCream2 = iceCream1 + iceCream1;
        byte egg = 70;
        int eggs4 = 4 * egg;
        int products = bananas5 + milk200 + iceCream2 + eggs4;
        final double KG = 1000.00; //использую значенние double, потому что результат при измерение веса обычно не целый
        double productsKG = products / KG;
        System.out.println("Общее количество завтрака в грамма будет " + products+ " грамм, а в килограммах составит "
        + productsKG+ " килограмм.");
        System.out.println("ЗАДАЧА 7");
        //Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        //а сколько — если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты всех подсчетов выведите в консоль.
        short oneVersion = 250;
        short twoVersion = 500;
        short unwanted = 7;
        double unwantedGramm = unwanted * KG;
        int daysOneVersion = (int) unwantedGramm / oneVersion;
        int daysTwoVersion = (int) unwantedGramm / twoVersion;
        System.out.println("Если нужно сбросить " +unwanted+ " килограмм, при рационе минус "+oneVersion+
                " грамм ежеденевно, то понадобиться - "+ daysOneVersion+ " дней, если использовать рацион минус "
        +twoVersion+" грамм каждый день, то понадобиться " +daysTwoVersion+ " дней.");
        System.out.println("ЗАДАЧА 8");
        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        //В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        //Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        //Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
        //а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной.
        //Дополнительно руководитель попросил посчитать
        //разницу между годовым доходом с нынешней зарплатой и после повышения.
        //Посчитайте, сколько будет получать каждый из сотрудников,
        //а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        final double PERCENT = 0.1;//% в Java высчитывается двумя способами:
        // 1) когда нужно посчитать процент от заданного числа, то нужно умножить это число на количество процентов и
        // поделить на 100;
        // 2) умножить число на ноль запятая количество процентов
        double newSalaryMasha = (67760 * PERCENT) + 67760;// в скобках на сколько больше стала зарплата
        double newSalaryDenis = (83690 * PERCENT) + 83960;
        double newSalaryKristina = (76230 * PERCENT) + 76230;
        final int YEAR = 12;
        double oldSalaryYearMasha = salaryMasha * YEAR;
        double oldSalaryYearDenis = salaryDenis * YEAR;
        double oldSalaryYearKristina = salaryKristina * YEAR;
        double newSalaryYearMasha =  newSalaryMasha * YEAR;
        double newSalaryYearDenis = newSalaryDenis * YEAR;
        double newSalaryYearKristina =  newSalaryKristina * YEAR;
        double differenceSalaryMasha = newSalaryYearMasha - oldSalaryYearMasha;
        double differenceSalaryDenis = newSalaryYearDenis - oldSalaryYearDenis;
        double differenceSalaryKristina = newSalaryYearKristina - oldSalaryYearKristina;
        System.out.println("Маша теперь получает " +newSalaryMasha+" рублей. Годовой доход вырос на "
                +differenceSalaryMasha+" рублей.");
        System.out.println("Денис теперь получает " +newSalaryDenis+" рублей. Годовой доход вырос на "
                +differenceSalaryDenis+" рублей.");
        System.out.println("Кристина теперь получает " +newSalaryKristina+" рублей. Годовой доход вырос на "
                +differenceSalaryKristina+" рублей.");























    }
}