public class PhraseOMatic {
    public static void main(String[] args) {

        //3 sets of words
        String [] wordListOne = {"one","two","three","four"};
        String [] wordListTwo = {"uno", "dos", "tres", "cuarto"};
        String [] wordListThree = {"un", "deux", "trois", "quatre"};

        //How many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out phrase
        System.out.println("What we need is a "+ phrase);
    }
}
