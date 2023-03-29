public class RightAlphabeticTriangle {
    public static void main(String[] args) {

        /*
         A
         A B 
         A B C
         A B C D

         */
        
         /* 
        int a=64;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(a+j) +" ");
            }
            System.out.println();
        }
       
    }
*/
    
    /*

    OUTPUT:
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     
     */

     /* 
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
         System.out.print("* ");

        }
        System.out.println();
    }

    */

    /*
    OUTPUT:
         * 
        **
       ***
      ****
     *****

     */
    
/* 
    
    for(int i=1;i<=5;i++)
    {
        for(int k=4;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

*/

/*
     *
    * *
   * * *
  * * * *
 * * * * *
 */

/* 
    for(int i=1;i<=5;i++)
    {
        for(int k=4;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

*/

/*
 1
 1 2
 1 2 3
 1 2 3 4
 */

 /* 
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
*/

/*
     1
    12
   123
  1234
 12345

 */

 /* 
     for(int i=1;i<=5;i++)
     {
        for(int k=4;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
     }
*/     

/*
 12345
 1234
 123
 12
 1

 */
/*      
    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
*/    

/*
 A
 B B
 C C C
 D D D D
 */
    
/* 
    int a=65;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)a +" ");
        }
        a++;
        System.out.println();
    }

*/

/*
 A
 A B
 A B C
 A B C D
 A B C D E

 */
    
/* 
    int a=65;
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)(a+j) +" ");
        }
        System.out.println();
    }

*/

/*

 * * * * *
 * * * *
 * * *
 * *
 * 
 
 */
 
 /* 
    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
*/
  
/*

 * * *
  * *
   *
   
 */

/* 
    for(int i=1;i<5;i++)
    {
        for(int k=1;k<i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<5-i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
*/    

/*

 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */

 /* 
    int number=1;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(number +" ");
            number++;
        }
        System.out.println();
    }

 */

    /* 
         * 
        * * 
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
     */
    /* 
    for(int i=1;i<5;i++)
    {
        for(int k=3;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=1;i<5;i++)
    {
        for(int k=1;k<=i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<5-i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    */
    /*
    OUTPUT
     * 
     * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     * 
     */
    /* 
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    for(int i=4;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    */
    //int number=1;
    /*
    OUTPUT:
     1
     1 2
     1 2 3
     1 2 3 4
     */
    
     /* 
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<i;j++)
        {
            System.out.print(j+" ");
            
        }
        System.out.println();
    }
    */

    /*
     4
     4 3
     4 3 2
     4 3 2 1

     */
    /* 
    for(int i=4;i>=1;i--)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print(j +" ");
        }
        System.out.println();
    }
    */
    /*
     A B C D
     A B C
     A B
     A

     */
    /* 
    int a=64;
    for(int i=4;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print((char) (a+j) +" ");
        }
        System.out.println();
    }
    */
    /*
     * * * *
     * * *
     * *
     * 
     * 
     * *
     * * *
     * * * *
     */
    /* 
    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    */

    /*
    OUTPUT:
     * * * *
      * * *
       * *
        *
        * 
       * *
      * * *
     * * * *
     */

     /* 
    for(int i=1;i<5;i++)
    {
        for(int k=1;k<=i;k++)
        {
            System.out.print(" ");

        }
        for(int j=1;j<=5-i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=1;i<5;i++)
    {
        for(int k=3;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    */

    /*
    OUTPUT:
     A B C D E
     A B C D 
     A B C
     A B
     A
     A
     A B
     A B C
     A B C D
     A B C D E

     */

     /* 
    int a=65;
    for(int i=4;i>=0;i--)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char) (a+j) +" ");
        }
        System.out.println();
    }
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char) (a+j) +" ");
        }
        System.out.println();
    }
    */

    /*
    OUTPUT:

           A
          A B
         A B C
        A B C D
       A B C D E


     */

     /* 
    int a=65;
    for(int i=0;i<=4;i++)
    {
        for(int k=3;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print((char) (a+j)+" ");
        }
        System.out.println();
    }
    */
/*

 A B C D
 A B C
 A B
 A

 */

 /* 
    int a=65;
    for(int i=3;i>=0;i--)
    {
        
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)(a+j)+" ");
        }
        System.out.println();
    }
    
*/    

    /*
    OUTPUT:

     A B C D
      A B C
       A B
        A

     */
/* 
    int a=65;
    for(int i=0;i<=3;i++)
    {
        for(int k=0;k<=i;k++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=3-i;j++)
        {
            System.out.print((char) (a+j)+" ");
        }
        System.out.println();
    }
    */

    /*
    OUTPUT:

    A
    A B
    A B C
    A B C D
    A B C
    A B
    A
     */

     /* 
    int a=65;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)(a+j)+" ");
        }
        System.out.println();
    }
    for(int i=2;i>=0;i--)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((char) (a+j)+" ");
        }
        System.out.println();
    }
    */

    /*
     A B C D
      A B C
       A B
        A
        A
       A B
      A B C
     A B C D
     */

     /* 
    int a=65;
    for(int i=0;i<=3;i++)
    {
        for(int k=0;k<=i;k++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=3-i;j++)
        {
            System.out.print((char)(a+j)+" ");
        }
        System.out.println();
    }
    for(int i=0;i<=3;i++)
    {
        for(int k=2;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print((char)(a+j)+" ");
        }
        System.out.println();
    }
    */

    /*
    OUTPUT:
     * * * *
       * * *
         * *
           * 
     */

    /* 
    for(int i=4;i>=1;i--)
    {
        for(int k=4;k>=i;k--)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
    */

    /*
    OUTPUT:

        *
       **
      ***
     ****
      ***
       **
        *
     */

/* 
    for(int i=1;i<=4;i++)
    {
        for(int k=3;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=3;i>=1;i--)
    {
        for(int k=4;k>i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
*/

   }

    
}
