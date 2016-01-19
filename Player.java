import java.lang.*;
import java.util.*;

public abstract class Player{
	private String name;
	private int score;
	protected Hand hand;
	public Player(String s, int i){
		name = s;
		score = i;
	}

	@Override
	public String toString(){
		return "Hi, I am Player "+name+".";
	}

	//the 13 tiles at the beginning
	public void initHand(ArrayList<ArrayList<Tile>> allTiles){
		hand = new Hand(allTiles);
	}
	public abstract Action doSomething(int from, Tile tile);//from 0自摸 1下一家 2對家 3上一家
	//	if(from == 0){//摸, 立直 加槓, 暗槓, 胡
	//		
	//	}
	//	else if(from == 3){//吃, 碰, 槓, 榮
	//	
	//	}
	//	else{//碰, 槓, 榮
	//	
	//	}
	public abstract void failed();//上一個動作失敗了

	public void addScore(int s){
		score+= s;
	}

	public abstract void GameOver();

}
