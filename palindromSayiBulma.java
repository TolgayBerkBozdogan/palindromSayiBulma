public class palindromSayiBulma {
   static boolean isPolindrom(int number){
       int  originalNumber=number;
       int reverseNumber = 0, remainder;
       while(number != 0) {
           remainder = number % 10;
           reverseNumber = reverseNumber * 10 + remainder;
           number = number / 10;
       }
           if (originalNumber==reverseNumber){
               System.out.print(originalNumber+ " is a palindrom number");
           }else{
               System.out.print(originalNumber + " is not a polindrom number");
           }

       return true;
   }



    public static void main(String[] args) {
       isPolindrom(393);






    }
}
