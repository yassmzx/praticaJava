


public class DistinctValues {
         public static void main(String[] args)
{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

      if (a == b && a == c )
         System.out.println("3 son iguales" );
         else if (a != b && a != c && c == b  || b != c && a == b || a == c && b != a && c != b )
         System.out.println("2 son iguales" );
        else if ( a != b && b != c )
         System.out.println("solo hay 1 que es igual");

    }
}
