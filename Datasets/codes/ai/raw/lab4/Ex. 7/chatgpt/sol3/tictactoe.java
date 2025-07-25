static void aiMove() {
    // Try to win
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
            if (isValid(r, c)) {
                board[r][c] = 'X';
                if (checkWin(r, c)) {
                    System.out.println("AI (X) played: " + r + " " + c);
                    return;
                }
                board[r][c] = '-';
            }
        }
    }
    // Try to block
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
            if (isValid(r, c)) {
                board[r][c] = 'O';
                if (checkWin(r, c)) {
                    board[r][c] = 'X';
                    System.out.println("AI (X) blocked at: " + r + " " + c);
                    return;
                }
                board[r][c] = '-';
            }
        }
    }
    // Random move
    int r, c;
    do {
        r = rand.nextInt(rows);
        c = rand.nextInt(cols);
    } while (!isValid(r, c));
    board[r][c] = 'X';
    System.out.println("AI (X) played: " + r + " " + c);
}
