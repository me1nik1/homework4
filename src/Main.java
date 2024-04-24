public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задание 2");
        int temperature = 15;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            if (temperature >= 5) {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        int speed = 120;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задание 4");
        int yearsOld = 26;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        } else {
            if (yearsOld >= 7 && yearsOld <= 17) {
                System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
            }
            if (yearsOld >= 18 && yearsOld <= 24) {
                System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
            }
            if (yearsOld > 24) {
                System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
            }
        }
        System.out.println();


        System.out.println("Задание 5");
        int years = 13;
        if (years < 5) {
            System.out.println("Если возраст равен " + years + ", то он не может кататься на аттракционе");
        } else {
            if (years > 5 && years < 14) {
                System.out.println("Если возраст равен " + years + ", то он  может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            }
            if (years > 14) {
                System.out.println("Если возраст равен " + years + ", то он может кататься без сопровождения взрослого");
            }
        }
        System.out.println();


        System.out.println("Задание 6");
        int peopleInTrainCarriage = 78;
        int trainCarriageCapacity = 102;
        int seatPlace = 60;
        int standingPlace = trainCarriageCapacity - seatPlace;
        if (peopleInTrainCarriage < seatPlace) {
            System.out.println("Если людей в вагоне " + peopleInTrainCarriage + ", то в вагоне есть сидячие места");
        } else {
            if (peopleInTrainCarriage > seatPlace && peopleInTrainCarriage < trainCarriageCapacity) {
                System.out.println("Если людей в вагоне " + peopleInTrainCarriage + ", то в вагоне есть стоячие места");
            }
            if (peopleInTrainCarriage >= trainCarriageCapacity) {
                System.out.println("Если людей в вагоне " + peopleInTrainCarriage + ", то вагон уже полностью забит ");
            }
        }
        System.out.println();


        System.out.println("Задание 7");
        int one = 50;
        int two = 65;
        int three = 14;
        if (one > two && one >three) {
            System.out.println(one);
        } else {
            if (two > three && two > one ) {
                System.out.println(two);
            }
            if (three > one && three > two) {
                System.out.println(three);
            }
        }
    }
}