package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {

    public ChessBoard() {

        privat board[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36},
                {37, 38, 39, 40, 41, 42, 43},
                {38, 39, 40, 41, 42, 43, 44},
                {45, 46, 47, 48, 49, 50, 51}
        };
        
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {
        throw new RuntimeException("Not implemented");
        int r = position.getRow();
        int c = position.getColumn();
        board[r][c]
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {
        throw new RuntimeException("Not implemented");

    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {
        throw new RuntimeException("Not implemented");
    }
}
