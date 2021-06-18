package challenge;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Lets split this up to into an Array";
                String[] parts = myString.split(" ");
                for (String part : parts){
                    System.out.println(part);
                }
            }
        };


//////////////lambda
     Runnable runnable1 = () ->{
         String myString = "Lets split this up to into an Array";
         String[] parts = myString.split(" ");
         for (String part : parts){
             System.out.println(part);
         }

     };





    }
}
