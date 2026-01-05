public class Main {
    // Задание номер 1
    public static void checkYears(int year) {
        if (year <= 1584) {
            System.out.println(year + " год — невисокосный год.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год — високосный год.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год — невисокосный год.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    // Задание номер 2
    public static void checkVersions(int number, int clientDeviceYear) {
        if (number == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (number == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (number == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (number == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }
    }

    // Задание номер 3
    public static void checkDistance(int deliveryDistance) {
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        checkYears(2000);
        checkVersions(1, 2026);
        int deliveryDistance = 95;
        checkDistance(deliveryDistance);
    }


}
