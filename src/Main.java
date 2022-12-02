public class Main {
    public static void main(String[] args) {

        System.out.println("===================== ДЗ 3 =============================");
        System.out.println("------------------- Задание 1 --------------------------");

        int age4 = 32;

        boolean goToKinderGarten = age4 >= 2 && age4 <= 6;
        boolean goToSchool = age4 >= 7 && age4 <= 18;
        boolean goToUniversity = age4 > 18 && age4 <= 24;
        boolean goToWork = age4 > 24;

        if (goToKinderGarten) System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        if (goToSchool) System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        if (goToUniversity) System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        if (goToWork) System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");

        System.out.println("------------------- Задание 2 --------------------------");

        int age5 = 13;

        if (age5 <5 ) System.out.println("Ребенку меньше 5 лет, он не может кататься на аттракционе");
        if (age5 >=5 && age5 <=14) System.out.println("Ребенку больше 5 но меньше 14 лет, " +
                "может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        if (age5 > 14) System.out.println("Ребенку больше больше 14 лет, он может кататься без сопровождения взрослого");

        System.out.println("------------------- Задание 3 --------------------------");

        int one = 9;
        int two = 8;
        int three = 1;

        int maxNumber = one;

        if ( two > maxNumber ) {
            maxNumber = two;
        }
        if (three > maxNumber ) {
            maxNumber = three;
        }
        System.out.println("Максимальное число "+maxNumber);
    }
}