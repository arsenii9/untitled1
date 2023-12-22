
package parallelismus;



import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ParallelClass2 {
    @Test
    public void paralel6() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel7() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel8() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel9() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
    @Test
    public void paralel10() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}

