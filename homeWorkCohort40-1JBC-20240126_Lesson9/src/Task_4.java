import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что делать с чадом?");
        System.out.println("Введите оценку, которую получил Ваш ребёнок ");
        System.out.println("Оценка должна быть от 1 до 12");
        short schoolGrading = scanner.nextByte();
        short remainingTime = 45;

        if (schoolGrading >= 1 && schoolGrading <= 12) {
            switch (schoolGrading) {
                case 1:
                case 2:
                    System.out.println("За уроки!!! Телевизор смотреть строго запрещено!");
                    break;
                case 3:
                    System.out.println("Я очень огорчён! Ты наказан на 30 минут!");
                    short penalty = 30;
                    int totalTime = printPenalty(remainingTime, penalty);
                    System.out.println("Сегодня ты смотришь телевизор всего: " + printHours(totalTime)
                            + " час и " + printMinutes(totalTime) + " минут!");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("Хотя бы что-то! К просмотру + 15 минут!");
                    short bonusTimeA = 15;
                    int totalTime1 = printBonus(remainingTime, bonusTimeA);
                    System.out.println("Сегодня ты смотришь телевизор всего: " + printHours(totalTime1)
                            + " час и " + printMinutes(totalTime1) + " минут!");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Ты просто молодец! К просмотру + 45 минут!");
                    short bonusTimeB = 45;
                    int totalTimeB = printBonus(remainingTime, bonusTimeB);
                    System.out.println("Сегодня ты смотришь телевизор всего: " + printHours(totalTimeB)
                            + " час и " + printMinutes(totalTimeB) + " минут!");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("Какой же ты у нас умничка! К просмотру + 1 час!");
                    short bonusTimeC = 60;
                    int totalTimeC = printBonus(remainingTime, bonusTimeC);
                    System.out.println("Сегодня ты смотришь телевизор всего: " + printHours(totalTimeC)
                            + " час и " + printMinutes(totalTimeC) + " минут ");
                    break;
            }
        } else {
            System.err.println("Вам самому или самой надо идти в школу.");
        }
    }

    public static int printHours(int totalTime) {
        int hour = totalTime / 60;
        return hour;
    }

    public static int printMinutes(int totalTime) {
        int minutes = totalTime % 60;
        return minutes;
    }

    public static int printPenalty(short remainingTime, short penalty) {
        int res = remainingTime - penalty;
        return res;
    }
    public static int printBonus(short remainingTime, short bonusTime){
        int res = remainingTime + bonusTime;
        return res;
    }
}
