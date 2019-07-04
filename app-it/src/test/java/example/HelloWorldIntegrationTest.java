package example;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldIntegrationTest {

  @Test
  public void test() {
    new HelloWorld().coveredByIntegrationTest();
  }
  @Test
  public void test1(){
    Assert.assertEquals(1,1);
  }
  @Test
  public void test2(){
    Assert.assertEquals(1,1);
  }

}
