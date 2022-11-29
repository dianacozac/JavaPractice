public class FirstClass {

    public static void main (String[] args) {
//        System.out.println(" Hello, Tim!");

        boolean isAlien = true;

        if (isAlien==false) {
            System.out.println("This is not an ALien");
            System.out.println("And I am scared of Aliens");
        }

        int TopScore = 60;

        if(TopScore == 100) {
            System.out.println( " You got the high score!");
                 }

        int SecondTopScore = 80;
        if (SecondTopScore > TopScore  && TopScore < 100) {
            System.out.println("Greater than Second top score and less then top score");

        }

        if (TopScore > 90 || SecondTopScore < 90) {

            System.out.println("Either or both are true");
        }

        boolean isCar = false;
        if ( isCar ) {
            System.out.println(" this is not suppose to happen");
        }



    }
}
