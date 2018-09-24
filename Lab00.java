public class Lab00
{
   public static void main(String[] args)
   {
    int x = 5;
    String y = "hello";
    double z = 9.8;

    System.out.println(" x: "+ x + " y: " + y + " z: " + z);

    int[] nums= {3, 6, -1, 2};
    for (int j : nums)
        System.out.println(j);

    int numFound = char_count(y, 'l');
    System.out.println("Found: " + numFound);

    for(int i = 0; i < 11; i++)
        System.out.print(i + " ");



   
   }
   public static int char_count(String s, char c)
   {
       int count = 0;
       char[] charArray = s.toCharArray();
       for (char ch : charArray) {
           if (ch == c) {
               count++;
           }
       }
        return count;
   }




}