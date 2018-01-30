package a1;

import java.util.ArrayList;

public class King extends ChessPiece {

    public King(ChessBoard board, Color color){
        super(board, color);
        try{
            if(color == Color.WHITE){
                setPosition("e1");
            } else {
                setPosition("e8");
            }
        } catch (IllegalPositionException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        if(color == Color.WHITE){
            return "\u2654";
        } else {
            return "\u265A";
        }
    }

    @Override
    public ArrayList<String> legalMoves() {
        return null;
    }
}
