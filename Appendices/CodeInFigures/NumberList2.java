public class NumberList2
{
   public static void main(String[] args)
   {
      double[] list = {0.20, 2.00, 2.20, 22.22,
         22.20, 222.00, 222.22};
      int x;
      for(x = 0; x < list.length; ++x)
         System.out.printf("%6.2f\n", list[x]);
   }
}
