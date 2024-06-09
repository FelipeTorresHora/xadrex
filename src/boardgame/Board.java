package boardgame;

public class Board {

    private int linha;
    private int coluna;
    private Peca[][] pecas;

    public Board(int linha, int coluna) {
        if (linha < 1 || coluna < 1) {
            throw new BoardException("Error criando tabuleiro: precisa ter pelo menos 1 linha e coluna");
        }
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca[linha][coluna];
    }
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public Peca peca(int linha, int coluna) {
        return pecas[linha][coluna];
    }
    public Peca peca(Position position){
        if (!positionExists(position)){
            throw new BoardException("Posição não está no tabuleiro");
        }
        return pecas[position.getLinha()][position.getColuna()];
    }
    public void placePiece(Peca peca,Position position){
        if (thereIsAPeca(position)){
            throw new BoardException("Já tem uma peça nessa posição" + position);
        }
        pecas[position.getLinha()][position.getColuna()] = peca;
        peca.position = position;
    }

    private boolean positionExists(int linha, int coluna){
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    private boolean positionExists(Position position){
        return positionExists(position.getLinha(), position.getColuna());
    }
    public boolean thereIsAPeca(Position position){
        if (thereIsAPeca(position)){
            throw new BoardException("Já tem uma peça nessa posição" + position);
        }
        return peca(position) != null;
    }
}
