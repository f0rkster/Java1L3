package de.forkster.java1;

public class main {
    public static void main(String[] args)
    {
        //TestCard testCard = new TestCard();

        //Given
        Card card = new Card("red",7);

        //When
        System.out.println(card.getColor()); // Print out red

        card.setColor("black");
        System.out.println(card.getColor()); // Print out red




    }
}
