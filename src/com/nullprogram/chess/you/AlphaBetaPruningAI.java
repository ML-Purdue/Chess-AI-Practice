package com.nullprogram.chess.you;

import com.nullprogram.chess.*;

import static com.nullprogram.chess.Piece.Side.BLACK;
import static com.nullprogram.chess.Piece.Side.WHITE;

public class AlphaBetaPruningAI implements Player {
    private Game game;

    public AlphaBetaPruningAI(Game game) {
        this.game = game;
    }

    @Override
    public Move takeTurn(Board board, Piece.Side side) {
        MoveScore move = predictBestMove(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 0, 4, board, side);
        System.out.println("Move score: " + (-1*move.getScore()));
        return move.getMove();
    }

    public MoveScore predictBestMove(double alpha, double beta, int ply, int finalPly, Board board, Piece.Side side) {
        // If we are on the finalPly
            // Return an evaluation of the board
        // else
            // For each possible move for the current player
                // Make the move
                // Recursively call predictBestMove(...)
                // Undo the move
            // Return the best move found (for the current player).

        // Hints:
            // Be sure to reverse the score when you return the MoveScore in the 'else' statmente
            // Be sure to increment the ply and switch sides when you recursively call predictBestMove(...)
            // Add the code to keep track of the best MoveScore within the foreach loop.

        if (ply == finalPly) {
            return new MoveScore(Evaluation.evaluateBoard(board, side), null).getInversedMoveScore();
        } else {
            MoveScore bestMove = new MoveScore(Double.NEGATIVE_INFINITY, null);
            MoveList moves = board.allMoves(side, true);
            moves.shuffle();
            for (Move move : moves) {
                board.move(move);
                Piece.Side opponent = (side == BLACK ? WHITE : BLACK);
                MoveScore newMoveScore = predictBestMove(-1 * beta, -1 * alpha, ply+1, finalPly, board, opponent);
                if (newMoveScore.getScore() > bestMove.getScore()) {
                    bestMove = new MoveScore(newMoveScore.getScore(), move);
                }
                board.undo();

                if (newMoveScore.getScore() >= beta) {
                    MoveScore betaScore = new MoveScore(-1 * beta, null);
                    return betaScore;
                }
                if (newMoveScore.getScore() > alpha) {
                    alpha = newMoveScore.getScore();
                }
            }
            if (bestMove.getMove() == null) // stalemate
                return new MoveScore(0, null);
            else
                return bestMove.getInversedMoveScore();
        }
    }
}
