public class Main {
    public static void main(String[] args) {

        System.out.println("===================== ДЗ 2 =============================");
        System.out.println("------------------- Задание 1 --------------------------");

        int age2 = 21;

        if (age2 >= 18) {
            System.out.println("Поздравляю, ты стал взрослым!");
        } else System.out.println("Ты еще не стал взрослым! Надо немного подождать!");

        System.out.println("------------------- Задание 2 --------------------------");

        int age3 = 22;

        if (age2 >= 7 && age2 < 18) {
            System.out.println("Еще надо поучиться в школе!");
        } else {
            if (age2 >= 18 && age2 < 24) {
                System.out.println("Университет это круто!");
            } else System.out.println("Студентческие годы прошли (((, пора искать первую работу!");
        }
        System.out.println("------------------- Задание 3 --------------------------");

        int totalSeats1 = 102; // Всего мест в вагоне
        int totalSeatPlace1 = 60; // Всего сидячих мест
        int totalStandingPlace1 = totalSeats1 - totalSeatPlace1; // Всего стоячих мест
        int enteredPass1 = 77; // Зашло пассажиров

        System.out.println("Всего мест в вагоне " + totalSeats1);
        System.out.println("Зашло в вагон " + enteredPass1 + " пассажиров");

//      Считаем, что вагон пустой

        if (enteredPass1 > totalSeatPlace1) {      // Если вошедших > сидячих мест, сидячие места заполняем, остаток передаем на стоячие места

            int occupiedStandingPlace1 = enteredPass1 - totalSeatPlace1; // сколько реально занято стоячих мест
            System.out.println("Сидячих мест " + totalSeatPlace1 + ", занято " + totalSeatPlace1 + ", свободно 0");

            if (occupiedStandingPlace1 <= totalStandingPlace1) { // Проверяем, если <= общего числа стоячих мест
                System.out.println("Стоячих мест " + totalStandingPlace1 + ", занято " + occupiedStandingPlace1 +
                        ", свободно " + (totalStandingPlace1 - occupiedStandingPlace1));
            } else {                                          // если > , заполняем полностью стоячие места, остаток выводим как лишних пассажиров
                System.out.println("Стоячих мест " + totalStandingPlace1 + ", занято " + totalStandingPlace1 +
                        ", свободно 0, " + "нет мест для " + Math.abs(totalStandingPlace1 - occupiedStandingPlace1) + " пассажира/ов");
            }
        } else {
            System.out.println("Сидячих мест " + totalSeatPlace1 + ", занято " + enteredPass1 + ", свободно " +
                    (totalSeatPlace1 - enteredPass1));
            System.out.println("Стоячих мест " + totalStandingPlace1 + ", занято 0, свободно " + totalStandingPlace1);
        }
    }
}