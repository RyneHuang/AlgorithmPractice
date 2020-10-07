package UnitTest.DatastructureTest.stringANDlineTest.arrayTest.findValueTest;

import DataStructure.stringANDline.array.findValue.Find2ValueinArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/7/22
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class Find2ValueinArrayTest {

    Find2ValueinArray f = new Find2ValueinArray();

    @Test
    public void testExist() {
        boolean flag = f.exist(source01, findValue01);
        assert flag;
        int[] target = f.getValuePosition(source01, findValue01);
        Arrays.equals(target, targetDemo01);

        flag = f.exist(source02, findValue02);
        assert !flag;
        target = f.getValuePosition(source02, findValue02);
        Arrays.equals(target, targetDemo02);

        flag = f.exist(source03, findValue03);
        assert !flag;
        target = f.getValuePosition(source03, findValue03);
        Arrays.equals(target, targetDemo03);

        flag = f.exist(source04, findValue04);
        assert flag;
        target = f.getValuePosition(source04, findValue04);
        Arrays.equals(target, targetDemo04);

        flag = f.exist(source05, findValue05);
        assert flag;
        target = f.getValuePosition(source05, findValue05);
        Arrays.equals(target, targetDemo05);

        flag = f.exist(source06, findValue06);
        assert !flag;
        target = f.getValuePosition(source06, findValue06);
        Arrays.equals(target, targetDemo06);

        flag = f.exist(source07, findValue07);
        assert !flag;
        target = f.getValuePosition(source07, findValue07);
        Arrays.equals(target, targetDemo07);
    }

    int[] source01 = {34, 5, 6, 78, 7, 65, 43, 4, 56, 789, 65, 41};
    int[] targetDemo01 = {1, 2};
    int findValue01 = 11;
    int[] source02 = {};
    int[] targetDemo02 = {};
    int findValue02 = 20;
    int[] source03 = null;
    int[] targetDemo03 = {};
    int findValue03 = 20;

    int[] source04 = {5, 46, 78, 9, 6, 5, 67, 68, 95, 657, 89};
    int[] targetDemo04 = {4, 9};
    int findValue04 = 663;
    int[] source05 = {654, 5, 67, 86, 54, 56, 78, 65, 44, 56, 789, 765, 44, 56, 78, 98, 76, 54, 3};
    int[] targetDemo05 = {1, 18};
    int findValue05 = 8;
    int[] source06 = {2};
    int[] targetDemo06 = {};
    int findValue06 = 8;

    int[] source07 = {654, 5, 67, 86, 54, 56, 78, 65, 44, 56, 789, 765, 44, 56, 78, 98, 76, 54, 3};
    int[] targetDemo07 = {-1, -1};
    int findValue07 = 4566;
}
