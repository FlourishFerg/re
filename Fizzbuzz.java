public class Fizzbuzz {
    public static void main(String[] args) {
        for(int num=1; num<=30; num++){

            if (num%3==0 && num%5!=0){
                System.out.println("fizz");
            }
          else  if (num%5==0 && num%3!=0){
                System.out.println("buzz");
            }
           else if (num%3==0 && num%5==0){
                System.out.println("Fizzbuzz");
            }
           else{
               System.out.println(num);

           }
        }
    }
}
