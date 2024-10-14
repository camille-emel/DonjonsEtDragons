package board;

import characters.EnemyDrake;
import characters.EnemyGoblin;
import characters.EnemySorcerer;
import java.util.ArrayList;
import java.util.Collections;

public class Board {
    private String enemy;
    private int cratePositon;
    private int sorcererPosition;
    private int goblinPosition;
    private int dragonPosition;
    private ArrayList<Case> board ;
    private int boardSize;

    public Board(int boardSize) {
        this.board = new ArrayList<>();
        this.boardSize = boardSize;
        buildBoard();
    }
    //Probléme de gestion de la casse 0 car notre perso débute à 1; donc le shuffle peut waste une casse importante.
    public void buildBoard(){
        numOfEnemyDrake(1);
        numOfEnemySorcerer(1);
        numOfEnemyGoblin(1);
        numOfCaseBox(4);
        for(int i = board.size(); i< boardSize; i++) {
            board.add(new CaseEmpty());
        }
        Collections.shuffle(board);
    }
    public void numOfEnemyDrake(int num){
        for (int i=0;i<num;i++) {
            board.add(new EnemyDrake());
        }
    }
    public void numOfEnemySorcerer(int num){
        for (int i=0;i<num;i++) {
            board.add(new EnemySorcerer());
        }
    }
    public void numOfEnemyGoblin(int num){
        for (int i=0;i<num;i++) {
            board.add(new EnemyGoblin());
        }
    }
    public void numOfCaseBox(int num){
        for (int i=0;i<num;i++) {
            board.add(new CaseBox());
        }
    }

    public ArrayList<Case> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Case> board) {
        this.board = board;
    }
}
