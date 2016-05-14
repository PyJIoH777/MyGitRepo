public class min
{
   public static void main(String[] args)
   {
      int a = 8, b = 7, e = 10, f = 2;
      int m = min(a, b, e, f);
      System.out.println("Minimum is "+ m);
   }

   public static int min(int c, int d, int r, int q)
   {
      int m2, m3, m4;
      if (c < d)
           m2 = c;
      else
           m2 = d;
      if (r < q)
    	  m3 = r;
      else m3 = q;
      
      if (m2 < m3)
    	  m4 = m2;
      else 
    	  m4 = m3;

      return m4;
   }
}