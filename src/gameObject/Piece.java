/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObject;

/**
 * TODO 丹羽さんが作ってね。
 * @author kosen
 */
public class Piece {
    public static final int State_Black = 0;
    public static final int State_White = 1;
    
    private int current_state;
    
    public Piece(){
        this.current_state = 0;
    }
    
    /** コマをひっくり返す */
    public void turn(){
        this.current_state = (this.current_state + 1) % 2;
    }
}
