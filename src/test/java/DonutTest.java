import static org.junit.jupiter.api.Assertions.assertEquals;

import org.boufnichel.DonutMaker;
import org.junit.jupiter.api.Test;

public class DonutTest {

  @Test
  void should_bake_donuts(){
    DonutMaker donutMaker = DonutMaker.count(4);
    assertEquals(donutMaker.bake(), "(°)(°)(°)(°)");
  }

  @Test
  void should_bake_donuts_with_topping(){
    DonutMaker donutMaker = DonutMaker.count(3).topping("Strawberry");
    assertEquals(donutMaker.bake(), "(Q)(Q)(Q)");
  }

  @Test
  void should_bake_donuts_with_size(){
    DonutMaker donutMaker = DonutMaker.count(2).size("Large");
    assertEquals(donutMaker.bake(), "((°))((°))");
  }

  @Test
  void should_bake_complex_order(){
    DonutMaker donutMaker = DonutMaker.count(2).size("Large");
    assertEquals(donutMaker.bake(), "((°))((°))");

    DonutMaker complexMaker = DonutMaker.copy(donutMaker).topping("Strawberry");
    assertEquals(complexMaker.bake(), "((Q))((Q))");
  }

}
