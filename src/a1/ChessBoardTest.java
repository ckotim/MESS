package a1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChessBoardTest {

    private ChessBoard cb;

    @Before
    public void setUp() throws Exception {
        cb = new ChessBoard();
    }

    @Test
    public void testInitialize() {
        //TODO
    }

    @Test
    public void testGetPiece() {
        cb.initialize();
        try {
            ChessPiece king = cb.getPiece("e1");
            assertEquals(King.class, king.getClass());
            assertEquals(ChessPiece.Color.WHITE, king.getColor());
            assertEquals("e1", king.getPosition());
        } catch (IllegalPositionException e){

        }
    }

    @Test
    public void testPlacePiece() {
        //TODO
    }

    @Test
    public void testMove() {
        //TODO
    }
}
