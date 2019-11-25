import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTest
{

   @Test
   public void testForNullList()
   {
      int[] arr = null;
      try {
         CountPositive.countPositive (arr);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }

   @Test
   public void test1()
   {
      int[] arr = {1,2,3};
      assertTrue ("test1", 3 == CountPositive.countPositive (arr));
   }

   @Test
   public void test2()
   {
      int[] arr = {0,2,0};
      assertTrue ("test2", 1 == CountPositive.countPositive (arr));
   }
}
