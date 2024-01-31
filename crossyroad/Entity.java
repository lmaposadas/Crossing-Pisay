/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossyroad;

public class Entity extends Tile {
    private String direction;
    public Entity(int x, int y, int width, int height, String direction) {
        super(x, y, width, height);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
    
}
