package com.theironyard;

/**
 * Created by branden on 3/29/16 at 11:48.
 */
public class Room {
    int row;
    int col;
    boolean wasVisitied = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean isStart = false;
    boolean isEnd = false;


    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}