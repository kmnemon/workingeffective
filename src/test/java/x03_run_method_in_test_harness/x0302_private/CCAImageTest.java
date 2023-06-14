package x03_run_method_in_test_harness.x0302_private;

import org.junit.jupiter.api.Test;

public class CCAImageTest {
    @Test
    public void setSnapRegion(){
        CCAImage ccaImage = new TestingCCAImage();
        ccaImage.setSnapRegion(1,1,1,1);
    }


}

class TestingCCAImage extends CCAImage{
    @Override
    public void setSnapRegion(int x, int y, int dx, int dy){}
}
