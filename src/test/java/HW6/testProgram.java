package HW6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.Assert;


public class testProgram {
    @Test
    @DisplayName("Сравнение средних значений списков")
    public void testAvgIsBigger() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(1, 2, 3));
        Program prog = new Program(firstList, secondList);
        Assert.assertEquals("Первый список имеет большее среднее значение", prog.avgIsBigger());

        firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        secondList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        prog = new Program(firstList, secondList);
        Assert.assertEquals("Второй список имеет большее среднее значение", prog.avgIsBigger());

        firstList = new ArrayList<>(Arrays.asList(1, 2, 3));
        secondList = new ArrayList<>(Arrays.asList(1, 2, 3));
        prog = new Program(firstList, secondList);
        Assert.assertEquals("Средние значения равны", prog.avgIsBigger());
    }
}
