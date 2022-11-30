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
        if ( !isCar ) {
            System.out.println(" this is not suppose to happen");
        }

//            Terrary Operator

            String MakeOfCar = "Vw";
            boolean isDomestic = MakeOfCar == "Vw" ? false : true ;  //boolean isDomestic ( MakeOfCar != "WV")

            if (isDomestic) {

                System.out.println( " This car is domestic in our country");
            }

               String s = (isDomestic) ? "This car is domestic" : " This car is not domestic"  ;
               System.out.println(s);

               //chalange 1

        double firstValue = 20.00d ;
        double secondValue = 80.00d ;
        double Total = firstValue + secondValue * 100.00 ;
        System.out.println ( "My Values total is " + Total );
        double theRemainder = Total % 40.00 ;
        System.out.println ( "theremainder " + theRemainder );
        boolean isNoRemainder = (theRemainder == 0) ? false : true ;
        System.out.println( "isNoRemainder = " + isNoRemainder);

//        }



    }
}
