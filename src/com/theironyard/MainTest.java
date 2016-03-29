package com.theironyard;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by branden on 3/29/16 at 18:45.
 */
public class MainTest {

    ArrayList<ArrayList<Room>> rooms = Main.createRooms();

    @Test
    public void createRooms() throws Exception {
        assertTrue(rooms.size() == 10);
    }


    @Test
    public void possibleNeighbors() throws Exception {
        //because of the way we made maze, we know that 0 0 should have 2 neighbors. Let's test on that.

        ArrayList<Room> possibleNeighbors = Main.possibleNeighbors(rooms, 0, 0);  //send it the first room

        assertTrue(possibleNeighbors.size() == 2);

    }

    @Test
    public void randomNeighbor() throws Exception {
        //let's check to see if a neighbor does come back when expected, and does not come back when expected as well

        //need to make a room that has no neighbors.
        ArrayList<ArrayList<Room>> noNeighbors = new ArrayList<>();
        for (int row = 0; row < 2; row++) {
            ArrayList<Room> roomRow = new ArrayList<>();
            for (int col = 0; col < 2; col++) {
                roomRow.add(new Room(row, col));
            }
            noNeighbors.add(roomRow);
        }

        noNeighbors.get(0).get(1).wasVisitied = true; //been there
        noNeighbors.get(1).get(0).wasVisitied = true; //been there, no neighbors!

        Room neighborNull = Main.randomNeighbor(noNeighbors, 0, 0);

        assertTrue(Main.randomNeighbor(rooms, 0, 0) != null);

        assertTrue(Main.randomNeighbor(noNeighbors, 0, 0) == null);


    }

    @Test
    public void tearDownWall() throws Exception {

    }

    @Test
    public void createMaze() throws Exception {

    }
}