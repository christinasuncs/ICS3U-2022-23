public class Die { // model some type of object, import or use in other projects
    // attributes - info we need to know about die at any current point in time
    private int numSides;
    private int topSide;
    // private = people don't have access to them
    // *private attributes are only visible in the class
    // *attributes define the current state of this class

    public int getTopSide() {
        return topSide;
    }

    // constructor - makes an instance, create a die
    // constructor has same name as class
    public Die(int numSides){
        this.numSides = numSides; // "this" refers to this particular instance of the class
        this.roll();
    }

    public Die(){
        this.numSides = 6;
        this.roll();
    }

    /* IF you do not explicitly write your own constructor Java will implicitly supply one that takes no arguements and calls your parent's constructor */

    public void roll() {
        topSide = (int)(Math.random() * numSides) + 1;
    }

    public String toString(){
        return "" + this.topSide;
    }

}
