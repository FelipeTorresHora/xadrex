package boardgame;

public class Peca{

    protected Position position;
    private Board board;

    public Peca(Board board){
        this.board = board;
        position = null;
    }

    protected Board getBoard(){
        return board;
    }


}
