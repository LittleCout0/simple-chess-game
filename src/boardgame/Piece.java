package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(){}

    public Piece(Board board){
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public List<Piece> possibleMoves(){
        return new ArrayList<>();
    }

    public Boolean possibleMove(Position position){
        return Boolean.TRUE;
    }

    public Boolean isThereAnyPossibleMove(){
        return Boolean.TRUE;
    }
}
