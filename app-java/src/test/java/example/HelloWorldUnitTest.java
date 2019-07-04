package example;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldUnitTest {

  @Test
  public void test() {
    new HelloWorld().coveredByUnitTest();
  }
  @Test
  public void test1(){
    Assert.assertEquals(1,2);
  }
  @Test
  public void test2(){
    Assert.assertEquals(1,2);
  }

}
