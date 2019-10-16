
public class DistinctValues
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


      
      if (a != b && a != c )
        System.out.println(a + " " + "is" +  "distinct values"+ " " + "the" + " " + b + " " + c );
       else if (b != a && b != c )
         System.out.println(b + " " + "is" +  "distinct values"+ " " + "the" + " "  + a + " " + c );
       else if (c != a && c != b  )
         System.out.println(c + " " + "is" +  "distinct values"+ " " + "the" + " " + a + " " + b);
        else 
          System.out.println("IS NOT NUMBER DISTINCT VALUES");






    }
}
