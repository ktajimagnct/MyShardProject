/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObject;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author kosen
 */
public class Board {
    public final int GameState_int = 0;
    public final int GameState_playing = 1;
    public final int GameState_gameend = 2;
    
    private HashMap<Point,Piece> BoardPiece;
    
    public Board(){
        this.init();
    }
    
    public void init(){
    }
    
    public void play(int playerid,int place){
        
    }
    
    
}
