/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossyroad;

public class Player extends Entity {
    private int lives, nextTile;
    public Player(int x, int y, int width, int height, String direction, int lives) {
        super(x, y, width, height, direction);
        this.lives = 3;
    }
    public void move (String direction) {
		
	switch (direction) {
            case "up":		
		if(getNextTile().contains("Enemy")) {
                    lives = getLives() - 1;
		}
                else if(getNextTile().contains("Block")) {
                    nextTile = map[x][y];
		}
                else if(getNextTile().contains("Platform")) {
                    nextTile = map[x][y+1];
		}
                else {
                    nextTile = map[x][y+1];
                }
            break;
		
            case "left": 		
		if(getNextTile().contains("Enemy")) {
                    lives = getLives() - 1;
		}
                else if(getNextTile().contains("Block")) {
                    nextTile = map[x][y];
		}
                else if(getNextTile().contains("Platform")) {
                    nextTile = map[x][y+1];
		}
                else {
                    nextTile = map[x-1][y];
                }
            break;

            case "right":	
		if(getNextTile().contains("Enemy")) {
                    lives = getLives() - 1;
		}
                else if(getNextTile().contains("Block")) {
                    nextTile = map[x][y];
		}
                else if(getNextTile().contains("Platform")) {
                    nextTile = map[x][y+1];
		}
                else {
                    nextTile = map[x+1][y];
                }
            break;

            default: 
		nextTile = map[x][y];
        }
    }

    public int getLives() {
        return lives;
    }

    public int getNextTile() {
        return nextTile;
    }
}
