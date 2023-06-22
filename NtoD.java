
package ntod;

import java.util.Scanner;

public class NtoD {
              
    private static int number;
    public static String numberToWord(int a)
    { 
        String word="";
      String unitArray[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
      String tensArray[]={"Zero","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
      if(a==0)
      {
          System.out.println("Zero");
     }
     if(a<0)
     {
       String number1=""+a;
     number1=number1.substring(1);
     return "minus"+numberToWord(Integer.parseInt(number1));
     }
     if((a/1000000)>0)
     {
      word=word+numberToWord(a/1000000)+"million";
      a=a%1000000;
//         System.out.println(a);
     }
     if((a/1000)>0)
     {
      word=word+numberToWord(a/1000)+"thousand";
      a=a%1000;
      
     }
     if((a/100)>0)
     {
      word=word+numberToWord(a/100)+"hundred";
      a=a%100;
      
     }
     if(a>0)
     {
       if(a<20)
       {
              word=word+unitArray[a];
       }
       else
       {
           word=word+tensArray[a/10];
        if(a%10>0)
        {
          word=word+"  "+unitArray[a%10];
        }
       }
    
     }
     return word;
    }
    
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
   number=sc.nextInt();
//    int number=25435;
if(number==0)
   {
         System.out.println("Zero");  
   }
   else
            System.out.println("number to word: "+numberToWord(number));
                  
    }
    
}
