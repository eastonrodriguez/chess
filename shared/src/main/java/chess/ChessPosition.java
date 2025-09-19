package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {

    public ChessPosition(int row, int col) {
        for (int c = 0; c < 8; c++) {
            board[1][c] = new ChessPiece.PieceType.PAWN.TeamColor.BLACK();
            board[6][c] = new ChessPiece.PieceType.PAWN.TeamColor.WHITE();
        }

        board[0][1] = new ChessPiece.PieceType.KNIGHT.TeamColor.BLACK();
        board[0][6] = new ChessPiece.PieceType.KNIGHT.TeamColor.BLACK();
        board[7][1] = new ChessPiece.PieceType.KNIGHT.TeamColor.WHITE();
        board[7][6] = new ChessPiece.PieceType.KNIGHT.TeamColor.WHITE();

        board[0][0] = new ChessPiece.PieceType.ROOK.TeamColor.BLACK();
        board[0][7] = new ChessPiece.PieceType.ROOK.TeamColor.BLACK();
        board[7][0] = new ChessPiece.PieceType.ROOK.TeamColor.WHITE();
        board[7][7] = new ChessPiece.PieceType.ROOK.TeamColor.WHITE();

        board[0][2] = new ChessPiece.PieceType.BISHOP.TeamColor.BLACK();
        board[0][5] = new ChessPiece.PieceType.BISHOP.TeamColor.BLACK();
        board[7][2] = new ChessPiece.PieceType.BISHOP.TeamColor.WHITE();
        board[7][5] = new ChessPiece.PieceType.BISHOP.TeamColor.WHITE();

        board[0][3] = new ChessPiece.PieceType.QUEEN.TeamColor.BLACK();
        board[7][3] = new ChessPiece.PieceType.QUEEN.TeamColor.WHITE();

        board[0][4] = new ChessPiece.PieceType.KING.TeamColor.BLACK();
        board[7][4] = new ChessPiece.PieceType.KING.TeamColor.WHITE();
    }
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        throw new RuntimeException("Not implemented");
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        throw new RuntimeException("Not implemented");
    }
}
