package a1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChessBoard {
    // chess board is 2d array of pieces
    private ChessPiece[][] board;

    // default ctor for creating standard 8x8 board
    public ChessBoard() {
        board = new ChessPiece[8][8];
    }

    // initialize board to starting positions
    public void initialize() {

        //TODO pawns
        //TODO queen
        //TODO rook
        //TODO knight
        //TODO bishop
    }

    // returns piece at given location
    public ChessPiece getPiece(String position) throws IllegalPositionException {
        // if legal, then get piece information
        if(isLegal(position)){
            return board[position.charAt(0) - 97][position.charAt(1) - 49];
        } else {
            throw new IllegalPositionException();
        }
    }

    // place piece on board
    public boolean placePiece(ChessPiece piece, String position) {
        if(piece.legalMoves().contains(position)){
            try {
                piece.setPosition(position);
                return true;
            } catch (IllegalPositionException e){
                return false;
            }
        }
        return false;
    }

    //

    // helper methods

    // test if legal move in general
    private boolean isLegal(String position) {
        String coordinates = "[a-h][1-8]";
        Pattern pat = Pattern.compile(coordinates);
        Matcher mat = pat.matcher(position);
        return mat.matches();
    }

}
