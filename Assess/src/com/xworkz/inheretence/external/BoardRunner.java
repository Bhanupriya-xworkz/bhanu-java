package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Board;
import com.xworkz.inheretence.internal.Whiteboard;

public class BoardRunner {
        public static void main(String[] args) {
            // Creating an object of Whiteboard (which is a subclass of Board)
            Board board = new Whiteboard();
            Board basicBoard = new Board();

            // Using basic board operations
            basicBoard.draw();
            basicBoard.erase();
            basicBoard.write();
            basicBoard.clean();

            // Using Whiteboard operations
            Whiteboard whiteboard = new Whiteboard();
            whiteboard.markText();
            whiteboard.organizeContent();
            whiteboard.draw();
        }
    }

