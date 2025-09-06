public class Patterns {
    public static void main(String[] args)
    {
        int n=4;
        int m=5;

        //Box
        for(int i =1; i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Hollow Box
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1||j==1||i==n||j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println();
        //Half-pyramid
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Inverted pyramid
       for(int i=n;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println();
       //inverted mirrored pyramid
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //180* rotated pyramid
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Half pyramid with numbers
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //inverted half pyramid with numbers
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //Floyd's triangle
        int x=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        System.out.println();
        //Boolean Traingle
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) {
                if ((i + j) % 2 == 0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        System.out.println();
        //Solid Rhombus
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Number Pyramid
        int t=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=t;j++)
            {
                System.out.print(t+" ");
            }
            t++;
            System.out.println();
        }
    }
}
