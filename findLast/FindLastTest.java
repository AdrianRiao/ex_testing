import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{

   @Test
   public void testForNullList()
   {
      int[] arr = null;
      int num = 3;
      try {
         FindLast.findLast (arr,num);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }

   @Test
   public void test1()
   {
      int[] arr = {1,2,3};
      int num = 3;
      assertTrue ("test1", 2 == FindLast.findLast (arr,num));
   }

   @Test
   public void test2()
   {
      int[] arr = {0,2,0};
      int num = 0;
      assertTrue ("test2", 2 == FindLast.findLast (arr,num));
   }
   
   @Test
   public void test3()
   {
      int[] arr = {0,2,3};
      int num = 0;
      assertTrue ("test3", 0 == FindLast.findLast (arr,num));
   }
}
