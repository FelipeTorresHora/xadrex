package chess;

import boardgame.Board;
import boardgame.Peca;

public abstract class ChessPiece extends Peca{
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract String tostring();
}
