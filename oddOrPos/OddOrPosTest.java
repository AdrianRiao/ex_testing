import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{

   @Test
   public void testForNullList()
   {
      int[] arr = null;
      try {
         OddOrPos.oddOrPos (arr);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }

   @Test
   public void test1()
   {
      int[] arr = {1,2,3};
      assertTrue ("test1", 3 == OddOrPos.oddOrPos (arr));
   }

   @Test
   public void test2()
   {
      int[] arr = {0,2,0};
      assertTrue ("test2", 1 == OddOrPos.oddOrPos (arr));
   }
   
   @Test
   public void test3()
   {
      int[] arr = {-3,2,-3};
      assertTrue ("test3", 3 == OddOrPos.oddOrPos (arr));
   }
}
