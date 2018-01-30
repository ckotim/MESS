package a1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class KingTest {

    private ChessBoard cb;
    private King wk;
    private King bk;

    @Before
    public void setUp() {
        cb = new ChessBoard();
        wk = new King(cb, ChessPiece.Color.WHITE);
        bk = new King(cb, ChessPiece.Color.BLACK);
    }

    @Test
    public void testGetColor(){
        assertEquals(ChessPiece.Color.WHITE, wk.getColor());
        assertEquals(ChessPiece.Color.BLACK, bk.getColor());
    }

    @Test
    public void testGetPosition(){
        assertEquals("e1", wk.getPosition());
        assertEquals("e8", bk.getPosition());
    }

    @Test
    public void testSetPosition(){
        // valid position
        try {
            wk.setPosition("d2");
        } catch (IllegalPositionException e) {
            fail("Illegal Position");
        }

        // invalid row
        try {
            wk.setPosition("z2");
        } catch (IllegalPositionException e0) {
            // invalid column
            try {
                wk.setPosition("d9");
            } catch (IllegalPositionException e1) {
                // invalid length
                try {
                    wk.setPosition(" d2");
                } catch (IllegalPositionException e2) {
                    return;
                }
            }
        }
        fail("Illegal Position Allowed");
    }

    @Test
    public void testToString() {
        assertEquals("\u2654", wk.toString());
        assertEquals("\u265A", bk.toString());
    }

    @Test
    public void testLegalMoves() {

    }

}
