package boardgame;

public class Board {

    private int linha;
    private int coluna;
    private Peca[][] pecas;

    public Board(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca[linha][coluna];
    }
    public int getLinha() {
        return linha;
    }
}
