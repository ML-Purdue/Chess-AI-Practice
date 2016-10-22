package com.nullprogram.chess.you;

import com.nullprogram.chess.*;

public class AlphaBetaPruningAI implements Player {
    private Game game;

    public AlphaBetaPruningAI(Game game) {
        this.game = game;
    }

    @Override
    public Move takeTurn(Board board, Piece.Side side) {
        return predictBestMove(0, 5, board, side).getMove();
    }

    public MoveScore predictBestMove(int ply, int finalPly, Board board, Piece.Side side) {
        // TODO:
            // 1. Copy your minimax code to this method
            // 2. Modify MoveScore to contain the alpha and beta values
            // 3. Handle the passing of alpha and beta from the parent to the child, and from the child to the parent.
                // Hint: Modify the method signature for predictBestMove(...)
                // Hint: When passing to child, multiply alpha and beta by -1 and reverse them
                // Hint: When passing to parent, do the same as you would for the child, but compare the new alpha/beta
                //       values against the old ones, and accept the most restrictive ones.
            // 4. Add the code for initializing Alpha and Beta in the first time you call predictBestMove(...)
            // 5. Add the code for pruning away sections of the search tree you don't want to explore
                // Hint: When alpha and beta contradict one another, your prune away that node. This will only happen
                //       after a node's child has been analized.

        return null;
    }
}
