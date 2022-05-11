import org.boufnichel.MergeOptions;
import org.boufnichel.Shapes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {

  @Test
  void test_spikes(){
    Shapes shapes = new Shapes("V4");
    assertEquals(shapes.print(), "VVVV");
  }

  @Test
  void test_merge_spikes(){
    Shapes shapes = new Shapes("V4");
    shapes.merge(MergeOptions.SPIKE);
    assertEquals(shapes.print(), "WW");
  }

  @Test
  void test_I(){
    Shapes shapes = new Shapes("V4|I5");
    assertEquals(shapes.print(), "VVVV-IIIII");
  }

  @Test
  void test_merge_I(){
    Shapes shapes = new Shapes("IIIII");
    shapes.merge(MergeOptions.I);
    assertEquals(shapes.print(), "HHI");
  }


}
