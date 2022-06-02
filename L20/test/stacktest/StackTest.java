package stacktest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import stack.ArrayStack;
import stack.StackI;
import stack.NodeStack;
import stack.ArrayListStack;

@TestMethodOrder(OrderAnnotation.class)
class StackTest
{
    private StackI stack;

    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.stack = new ArrayListStack();

        this.card1 = new Card("Spade", "Jack");
        this.card2 = new Card("Club", "2");
        this.card3 = new Card("Heart", "3");
        this.card4 = new Card("Heart", "4");
        this.card5 = new Card("Diamond", "5");
        this.card6 = new Card("Diamond", "6");
    }

    @Test
    @Order(1)
    void test_stack_canPushAndPop()
    {
        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        stack.push(card1);
        stack.push(card2);
        stack.push(card3);
        stack.push(card4);
        stack.push(card5);
        stack.push(card6);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        Card cardPopped = (Card) stack.pop();
        assertEquals(card6, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card5, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card4, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card3, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card2, cardPopped);

        cardPopped = (Card) stack.pop();
        assertEquals(card1, cardPopped);

        assertThrows(NoSuchElementException.class, () -> {
            stack.pop();
        });
    }

    @Test
    @Order(2)
    void test_stack_canPeek()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        stack.push(card1);
        Card cardPeeked = (Card) stack.peek();
        assertEquals(card1, cardPeeked);

        stack.push(card2);
        cardPeeked = (Card) stack.peek();
        assertEquals(card2, cardPeeked);

        stack.push(card3);
        cardPeeked = (Card) stack.peek();
        assertEquals(card3, cardPeeked);

        stack.pop();
        cardPeeked = (Card) stack.peek();
        assertEquals(card2, cardPeeked);

        stack.pop();
        cardPeeked = (Card) stack.peek();
        assertEquals(card1, cardPeeked);

        stack.pop();
        assertThrows(NoSuchElementException.class, () -> {
            stack.peek();
        });
    }

    @Test
    @Order(3)
    void test_stack_returnsIsEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertTrue(stack.isEmpty());

        stack.push(card1);
        assertFalse(stack.isEmpty());

        stack.push(card2);
        assertFalse(stack.isEmpty());

        stack.push(card3);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertFalse(stack.isEmpty());

        stack.pop();
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    @Order(4)
    void test_stack_returnsSize()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertEquals(0, stack.size());

        stack.push(card1);
        assertEquals(1, stack.size());

        stack.push(card2);
        assertEquals(2, stack.size());

        stack.push(card3);
        assertEquals(3, stack.size());

        stack.push(card4);
        assertEquals(4, stack.size());

        stack.push(card5);
        assertEquals(5, stack.size());

        stack.push(card6);
        assertEquals(6, stack.size());

        stack.pop();
        assertEquals(5, stack.size());

        stack.pop();
        assertEquals(4, stack.size());

        stack.pop();
        assertEquals(3, stack.size());

        stack.pop();
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());

        stack.pop();
        assertEquals(0, stack.size());
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
