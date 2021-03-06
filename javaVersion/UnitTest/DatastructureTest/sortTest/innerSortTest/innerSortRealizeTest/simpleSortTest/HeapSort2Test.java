package UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.simpleSortTest;

import DataStructure.sort.innerSort.innerSortRealize.HeapSort2;
import UnitTest.DatastructureTest.sortTest.innerSortTest.innerSortRealizeTest.InnerSortRealizeTestData;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

/**
 * @author liujun
 * @version 1.0
 * @date 2020-02-11 15:11
 * @authorEmail liujunfirst@outlook.com
 * @description 
 * @blogURL
 */
public class HeapSort2Test extends InnerSortRealizeTestData {

    @Test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void TestInnerSortRealize(){
        super.TestInnerSortRealize(new HeapSort2());
    }
}
