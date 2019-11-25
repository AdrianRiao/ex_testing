import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{

   @Test
   public void testForNullList()
   {
      int[] arr = null;
      try {
         LastZero.lastZero (arr);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }

   @Test
   public void test1()
   {
      int[] arr = {1,2,3};
      assertTrue ("test1", -1 == LastZero.lastZero (arr));
   }

   @Test
   public void test2()
   {
      int[] arr = {1,0,3};
      assertTrue ("test2", 1 == LastZero.lastZero (arr));
   }
   
   @Test
   public void test3()
   {
      int[] arr = {1,0,3,0};
      assertTrue ("test3", 3 == LastZero.lastZero (arr));
   }
}
