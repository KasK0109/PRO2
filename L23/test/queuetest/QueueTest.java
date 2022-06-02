package queuetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import queue.Queue;
import queue.SnackQueue;
import snacks.Limb;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class QueueTest
{
    private Queue<Limb> queue;

    private Limb limb1;
    private Limb limb2;
    private Limb limb3;
    private Limb limb4;
    private Limb limb5;
    private Limb limb6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.queue = new Queue(5);

        this.limb1 = new Limb(Limb.Types.Finger);
        this.limb2 = new Limb(Limb.Types.Foot);
        this.limb3 = new Limb(Limb.Types.Hand);
        this.limb4 = new Limb(Limb.Types.Heel);
        this.limb5 = new Limb(Limb.Types.Knee);
        this.limb6 = new Limb(Limb.Types.Toe);
    }

    @Test
    @Order(1)
    void test_queue_canEnqueueAndDequeue()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        queue.enqueue(limb1);
        queue.enqueue(limb2);
        queue.enqueue(limb3);
        queue.enqueue(limb4);
        queue.enqueue(limb5);
        queue.enqueue(limb6);

        Limb meatToSmoke = (Limb) queue.dequeue();
        assertEquals(limb1.getType(), meatToSmoke.getType());

        meatToSmoke = (Limb) queue.dequeue();
        assertEquals(limb2.getType(), meatToSmoke.getType());

        meatToSmoke = (Limb) queue.dequeue();
        assertEquals(limb3.getType(), meatToSmoke.getType());

        meatToSmoke = (Limb) queue.dequeue();
        assertEquals(limb4.getType(), meatToSmoke.getType());

        meatToSmoke = (Limb) queue.dequeue();
        assertEquals(limb5.getType(), meatToSmoke.getType());

        meatToSmoke = (Limb) queue.dequeue();
        assertEquals(limb6.getType(), meatToSmoke.getType());

        assertThrows(NoSuchElementException.class, () -> {
            queue.dequeue();
        });
    }

    @Test
    @Order(2)
    void test_queue_returnsSize()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertEquals(0, queue.size());

        queue.enqueue(limb1);
        assertEquals(1, queue.size());

        queue.enqueue(limb2);
        assertEquals(2, queue.size());

        queue.enqueue(limb3);
        assertEquals(3, queue.size());

        queue.enqueue(limb4);
        assertEquals(4, queue.size());

        queue.enqueue(limb5);
        assertEquals(5, queue.size());

        queue.enqueue(limb6);
        assertEquals(6, queue.size());

        queue.dequeue();
        assertEquals(5, queue.size());

        queue.dequeue();
        assertEquals(4, queue.size());

        queue.dequeue();
        assertEquals(3, queue.size());

        queue.dequeue();
        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());
    }

    @Test
    @Order(3)
    void test_queue_returnsIsEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertTrue(queue.isEmpty());

        queue.enqueue(limb1);
        assertFalse(queue.isEmpty());

        queue.enqueue(limb2);
        assertFalse(queue.isEmpty());

        queue.enqueue(limb3);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
