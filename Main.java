/*
Example output
Random Number Generated is: 1
Movie #: 18Jaws
Plot: A movie about sharks.
 */
public class Main {

    public static void main(String[]args){

        for(int i = 1; i<21; i++){

            Movie movie = randomMovieSelector();
            System.out.println("Movie #: " + i + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n"); //This is where the polymorphism concept is really shown

        }
    }

    public static Movie randomMovieSelector(){

        //generating a random number from 1 to 5
        int randomNumber = (int)(Math.random() * 5) +1;
        //outputting the random number
        System.out.println("Random Number Generated is: " + randomNumber );
        //depending on the random number (1,2,3,4,5) an instnace of an object of type of movie will be created.
        switch(randomNumber){

            case 1:
                return new Jaws();
            case 2:
                return new Rounders();
            case 3:
                return new TwentyOne();

            case 4:
                return new Cloverfield();

            case 5:
                return new Forgetable();

            default:
                return null;

        }

    }
}

/*
--------------------------------------------------------------------------------------------------------------------------------------
This is another class within the Main.java code file
It is usually recommended that you put them in separate files however, if you have small chucks of code not meant to be reused,
then it could make sense to put everything in the same code file.
---------------------------------------------------------------------------------------------------------------------------------------
*/
class Movie{

    //private field (encapsulation)
    private String name;

    //constructor
    public Movie (String name){

        //field = parameter
        this.name=name;
    }

    public String getName(){

        return name;
    }

    public String plot(){

        return "No Plot Available";
    }
}

class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }
    @Override
    public String plot(){

        return "A movie about sharks.";
    }
}

class Rounders extends Movie{

    public Rounders() {
        super("Rounders");
    }

    @Override
    public String plot(){

        return "A movie about gambling";
    }
}

class TwentyOne extends Movie{

    public TwentyOne(){

        super("21");
    }

    @Override
    public String plot(){

        return "A movie about gambling and some fake math";
    }

}

class Cloverfield extends Movie{

    public Cloverfield(){

        super("Cloverfield");
    }
    @Override
    public String plot(){

        return"Aliens come to earth and destroy statue of liberty, again";
    }
}

class Forgetable extends Movie {

    public Forgetable(){

        super("Forgettable");
    }
    //no plot method here on purpose
}






