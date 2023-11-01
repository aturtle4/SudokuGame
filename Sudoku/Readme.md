# Terminal Based Sudoku Game

```
This is a Java-based Sudoku game that allows you to play 
and solve Sudoku puzzles interactively. It includes a Sudoku 
board, user input validation, and checks to determine if 
the Sudoku puzzle is solved correctly.
```

## How to Play
```
1. Clone or download the repository to your local machine.
2. Open the project in your favorite Java development 
    environment.
3. Run the Main class to start the Sudoku game.
4. You'll be presented with an initial Sudoku board, and 
    you can fill in the cells one by one.
5. Input a row (1-9), column (1-9), and value (1-9) to 
    fill a cell. For example, to fill the cell in the first
    row, first column with the number 5, you can input: 1 1 5.
6. The game will validate your input and display the updated
    board.
7. Continue to fill in cells until the board is complete or
    you give up.
8. If you fill in all cells and the Sudoku puzzle is 
    solved correctly, you'll receive a "Congratulations" message. Otherwise, you'll be notified if your solution is incorrect.
```
## Code Structure
```
The code is organized into three main classes:
    - Main: The main class that handles the game's logic and 
            user interaction.
    - Validity: A utility class containing methods for checking
                the validity of Sudoku solutions, including 
                checking rows, columns, and subgrids.
    - Board: Represents the Sudoku board and includes methods 
            to display the board, get the current state of
             the board, and fill in cells.

```
## Sample Sudoku Puzzle
```
This code already contains a sample Sudoku puzzle to work on. You 
can replace this example with your own Sudoku puzzle.

```
## Author
- Armaan Singh