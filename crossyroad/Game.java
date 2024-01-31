/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crossyroad;

import java.util.ArrayList;

public class Game {
    private Player p1;
    private static ArrayList<Tile> map = new ArrayList<>(); 
    private static ArrayList<Block> Blocks = new ArrayList<>();
    private static ArrayList<Enemy> Enemies = new ArrayList<>();
    private static ArrayList<Platform> Platforms = new ArrayList<>();
    
    public Game(int width, int height) { 
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                map[i][j] = new Tile(template[i][j]);
            }
        }
    }

    public Player getPlayer() {
        return p1;
    }

    public static ArrayList<Tile> getMap() {
        return map;
    }

    public static ArrayList<Block> getBlocks() {
        return Blocks;
    }

    public static ArrayList<Enemy> getEnemies() {
        return Enemies;
    }

    public static ArrayList<Platform> getPlatforms() {
        return Platforms;
    }
}
