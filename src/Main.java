public class Main {
    public static void main(String[] args) {

        System.out.println("===================== ДЗ 1 =============================");
        System.out.println("------------------- Задание 1 --------------------------");

        int age = 17;

        if (age >= 18) {
            System.out.println("Поздравляю, ты стал взрослым!");
        }
        if (age < 18) {
            System.out.println("Ты еще не стал взрослым! Надо немного подождать!");
        }

        System.out.println("------------------- Задание 2 --------------------------");

        int age1 = 15;

        if (age1 >= 7 && age1 < 18) {
            System.out.println("Еще надо поучиться в школе!");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Университет это круто!");
        }
        if (age1 >=24) {
            System.out.println("Студентческие годы прошли (((, пора искать первую работу!");
        }

        System.out.println("------------------- Задание 3 --------------------------");

        int totalSeats = 102; // Всего мест в вагоне
        int totalSeatPlace = 60; // Всего сидячих мест
        int totalStandingPlace = totalSeats - totalSeatPlace; // Всего стоячих мест
        int enteredPass = 18; // Зашло пассажиров

        System.out.println("Всего мест в вагоне " + totalSeats);
        System.out.println("Зашло в вагон " + enteredPass + " пассажиров");

//      Считаем, что вагон пустой

        if (enteredPass > totalSeatPlace) {      // Если вошедших > сидячих мест, сидячие места заполняем, остаток передаем на стоячие места

            int occupiedStandingPlace = enteredPass - totalSeatPlace; // сколько реально занято стоячих мест
            System.out.println("Сидячих мест " + totalSeatPlace + ", занято " + totalSeatPlace + ", свободно 0");

            if (occupiedStandingPlace <= totalStandingPlace) { // Проверяем, если <= общего числа стоячих мест
                System.out.println("Стоячих мест " + totalStandingPlace + ", занято " + occupiedStandingPlace +
                        ", свободно " + (totalStandingPlace - occupiedStandingPlace));
            }
            if (occupiedStandingPlace > totalStandingPlace)
            {                                          // если > , заполняем полностью стоячие места, остаток выводим как лишних пассажиров
                System.out.println("Стоячих мест " + totalStandingPlace + ", занято " + totalStandingPlace +
                        ", свободно 0, " + "нет мест для " + Math.abs(totalStandingPlace - occupiedStandingPlace) + " пассажира/ов");
            }
        }
        if (enteredPass <= totalSeatPlace)
        {
            System.out.println("Сидячих мест " + totalSeatPlace + ", занято " + enteredPass + ", свободно " +
                    (totalSeatPlace - enteredPass));
            System.out.println("Стоячих мест " + totalStandingPlace + ", занято 0, свободно " + totalStandingPlace);
        }
    }
}