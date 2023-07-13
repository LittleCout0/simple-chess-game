package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row){
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        /*
         To put the piece in the correct row/column that user is seeing (not based on the matrix index),
             we need to do this subtraction.
         E.g.: If I choose 'A8', without subtraction the board will be printed at last matrix index, but for user
            the row 8 is the first, not the last.
        This also applies to char. As 'c' - 'a' returns an int 2 ('a'=1,'b'=2,'c'=3...) the logic is the same.
         */
        return new Position(8 - getRow(), getColumn() - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return "" + getColumn() + getRow();
    }
}
