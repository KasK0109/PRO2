package dequetest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import bryghus.Produkt;
import bryghus.Salg;
import deque.CircularArrayDeque;
import deque.DequeI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import queue.NodeQueue;

@TestMethodOrder(OrderAnnotation.class)
class DequeTest {

    private DequeI queue;

    private Salg salg1;
    private Salg salg2;
    private Salg salg3;
    private Salg salg4;
    private Salg salg5;
    private Salg salg6;

    @BeforeEach
    void setUp() throws Exception {

        this.queue = new CircularArrayDeque();

        Produkt kloster = new Produkt("Klosterbryg");
        Produkt sweet = new Produkt("Sweet Georgia Brown");
        Produkt extra = new Produkt("Extra Pilsner");
        Produkt classic = new Produkt("Classic Jazz");
        Produkt klippekort10 = new Produkt("Klippekort 10 klip");
        Produkt klippekort6 = new Produkt("Klippekort 6 klip");

        this.salg1 = new Salg(1);
        this.salg1.createSalgsLinje(kloster, 2, 40);

        this.salg2 = new Salg(2);
        this.salg2.createSalgsLinje(sweet, 3, 60);

        this.salg3 = new Salg(3);
        this.salg3.createSalgsLinje(extra, 2, 40);

        this.salg4 = new Salg(4);
        this.salg4.createSalgsLinje(classic, 3, 60);

        this.salg5 = new Salg(5);
        this.salg5.createSalgsLinje(klippekort10, 1, 160);

        this.salg6 = new Salg(6);
        this.salg6.createSalgsLinje(klippekort6, 2, 200);
    }

    @Test
    @Order(1)
    void test_deque_canAddAndRemove() {

        queue.addFirst(salg2);
        queue.addFirst(salg3);
        queue.addFirst(salg4);
        queue.addFirst(salg5);
        queue.addFirst(salg6);
        queue.addLast(salg1);

        Salg salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg2, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeLast();
        assertEquals(salg1, salgTilBehandling);

        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg3, salgTilBehandling);


        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg4, salgTilBehandling);


        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg5, salgTilBehandling);


        salgTilBehandling = (Salg) queue.removeFirst();
        assertEquals(salg6, salgTilBehandling);

        assertThrows(NoSuchElementException.class, () -> {
            queue.removeFirst();
        });

    }

    @Test
    @Order(2)
    void test_deque_getFirstAndGetLast() {

        queue.addFirst(salg2);
        queue.addFirst(salg3);
        queue.addFirst(salg4);
        queue.addFirst(salg5);
        queue.addFirst(salg6);
        queue.addLast(salg1);

        Salg foersteSalg = (Salg) queue.getFirst();
        assertEquals(salg6, foersteSalg);

        Salg sidsteSalg = (Salg) queue.getLast();
        assertEquals(salg1, sidsteSalg);
    }

    @Test
    @Order(3)
    void test_deque_returnsSize() {


    }

    @Test
    @Order(4)
    void test_deque_returnsIsEmpty() {

        assertTrue(queue.isEmpty());

        queue.addFirst(salg1);
        assertFalse(queue.isEmpty());

        queue.addFirst(salg2);
        assertFalse(queue.isEmpty());

        queue.addFirst(salg3);
        assertFalse(queue.isEmpty());

        queue.removeLast();
        assertFalse(queue.isEmpty());

        queue.removeFirst();
        assertFalse(queue.isEmpty());

        queue.removeFirst();
        assertTrue(queue.isEmpty());

    }
}
