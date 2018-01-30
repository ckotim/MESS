package a1;

        import java.util.ArrayList;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public abstract class ChessPiece {

    // colors for teams
    public enum Color {WHITE, BLACK};

    // board/position/team info
    protected ChessBoard board;
    protected int row;
    protected int column;
    protected Color color;


    // set the board and team
    public ChessPiece(ChessBoard board, Color color) {
        this.board = board;
        this.color = color;
    }

    // gets the team
    public Color getColor() {
        return color;
    }

    // get the position in x# format(a7, d6, j3)
    public String getPosition(){
        return "" + (char)(row + 97) + column;
    }

    // set the position
    public void setPosition(String position) throws IllegalPositionException {
        // create regex of coordinate style
        String coordinates = "[a-h][1-8]";
        Pattern pat = Pattern.compile(coordinates);
        Matcher mat = pat.matcher(position);

        // if match, then set
        if(mat.matches()){
            row = position.charAt(0) - 97;
            column = position.charAt(1);
        } else {
            throw new IllegalPositionException();
        }
    }

    // print the right character for each piece type
    abstract public String toString();

    // list of legal moves
    abstract public ArrayList<String> legalMoves();

}
