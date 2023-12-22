
package parallelismus;





import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ParallelClass1 {
    @Test
    public void paralel1() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel2() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel3() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel4() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel5() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
