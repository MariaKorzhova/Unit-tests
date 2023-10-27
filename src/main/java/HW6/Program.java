package HW6;

import java.util.List;
public class Program {
    private List<Integer> firstList;
    private List<Integer> secondList;

    public Program(List<Integer> firstList, List<Integer> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public static double findAvg(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        double avg = 0;
        for (int i : list) {
            avg += i;
        }
        return avg / list.size();
    }

    public String avgIsBigger() {
        double avg1 = findAvg(firstList);
        double avg2 = findAvg(secondList);
        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        }
        else if (avg2 > avg1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
