package chess;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;


/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {
    private final ChessGame.TeamColor teamColor;
    private final PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.teamColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return teamColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Set<ChessMove> moves = new HashSet<>();
        int r = myPosition.getRow();
        int c = myPosition.getColumn();
        switch (type) {
            case PAWN: {

            }
            case ROOK: {
                int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                for (int[] dir : directions) {
                    int r = row;
                    int c = col;
                    while (true) {
                        r += dir[0];
                        c += dir[1];
                        if (r < 0 || r >= 8 || c < 0 || c >= 8) break;
                        ChessPosition next = new ChessPosition(r + 1, c + 1);
                        ChessPiece target = board.getPiece(next);
                        if (target == null) {
                            moves.add(new ChessMove(myPosition, next, null));
                        } else {
                            if (target.getTeamColor() != teamColor) {
                                moves.add(new ChessMove(myPosition, next, null));
                            }
                            break;
                        }
                    }
                }
                break;
            }

            case BISHOP: {
                int[][] directions = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
                for (int[] dir : directions) {
                    ChessPosition next = new ChessPosition(myPosition.getRow() + d[0], myPosition.getColumn() + d[1]);
                    if (next.getRow() >= 1 && next.getRow() <= 8 && next.getColumn() >= 1 && next.getColumn() <= 8) {
                    while (true) {
                        r += dir[0];
                        c += dir[1];
                        if (r < 0 || r >= 8 || c < 0 || c >= 8) break;
                        ChessPosition next = new ChessPosition(r + 1, c + 1);
                        ChessPiece target = board.getPiece(next);
                        if (target == null) {
                            moves.add(new ChessMove(myPosition, next, null));
                        } else {
                            if (target.getTeamColor() != teamColor) {
                                moves.add(new ChessMove(myPosition, next, null));
                            }
                            break;
                        }
                    }
                }
                break;
            }

            case QUEEN: {
                int[][] directions = {
                        {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
                };
                for (int[] dir : directions) {
                    int r = myPosition.getRow();
                    int c = myPosition.getRow();
                    ChessPosition next = new ChessPosition(r, c);
                    if (r < 1 || r > 8 || c < 1 || c > 8) break;
                    ChessPiece target = board.getPiece(next);

                }
                break;
            }

            case KNIGHT: {
                int[][] jumps = {
                        {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                        {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
                };
                for (int[] j : jumps) {
                    int r = row + j[0];
                    int c = col + j[1];
                    if (r >= 0 && r < 8 && c >= 0 && c < 8) {
                        ChessPosition next = new ChessPosition(r + 1, c + 1);
                        ChessPiece target = board.getPiece(next);
                        if (target == null || target.getTeamColor() != teamColor) {
                            moves.add(new ChessMove(myPosition, next, null));
                        }
                    }
                }
                break;
            }

            case KING: {
                int[][] deltas = {
                        {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
                };
                for (int[] d : deltas) {
                    int r = row + d[0];
                    int c = col + d[1];
                    if (r >= 0 && r < 8 && c >= 0 && c < 8) {
                        ChessPosition next = new ChessPosition(r + 1, c + 1);
                        ChessPiece target = board.getPiece(next);
                        if (target == null || target.getTeamColor() != teamColor) {
                            moves.add(new ChessMove(myPosition, next, null));
                        }
                    }
                }
                break;
            }
        }

        return moves;
    }
}
