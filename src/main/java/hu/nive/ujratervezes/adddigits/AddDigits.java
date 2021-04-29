package hu.nive.ujratervezes.adddigits;

public class AddDigits {

   public static int addDigits(String input) {

       if (input == null || input.equals("")) return -1;

       int l = input.length();
       int sum = 0;
       for (int i = 0; i < l; i++)
       {
           if (Character.isDigit(input.charAt(i)))
           {
               String temp = input.substring(i,i+1);
               sum += Integer.parseInt(temp);
           }
       }

       return sum;

    }
}
