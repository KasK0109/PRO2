package stacktest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import stack.DropOutStackI;
import stack.DropOutStack;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DropOutStackTest {

    private DropOutStackI dropOutStack;

    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6;

    @BeforeEach
    void setUp() throws Exception {

        this.dropOutStack = new DropOutStack();

        this.card1 = new Card("Spade", "Jack");
        this.card2 = new Card("Club", "2");
        this.card3 = new Card("Heart", "3");
        this.card4 = new Card("Heart", "4");
        this.card5 = new Card("Diamond", "5");
        this.card6 = new Card("Diamond", "6");
    }

    @Test
    @Order(1)
    void test_dropOutStack_canPushAndPop() {

        dropOutStack.push(card1);
        dropOutStack.push(card2);
        dropOutStack.push(card3);
        dropOutStack.push(card4);
        dropOutStack.push(card5);
        dropOutStack.push(card6);

        assertEquals(dropOutStack.peek(), card6);

        System.out.println(dropOutStack.toString());
        dropOutStack.pop();
        System.out.println(dropOutStack.toString());
        dropOutStack.pop();
        System.out.println(dropOutStack.toString());
    }


    class Card
    {
        public String symbol;
        public String ranking;

        public Card(String symbol, String ranking)
        {
            super();
            this.symbol = symbol;
            this.ranking = ranking;
        }

        @Override
        public String toString()
        {
            return this.symbol + ": " + this.ranking;
        }
    }
}
