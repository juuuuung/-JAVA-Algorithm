package baekjoon.problem;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

interface Game{
	String GetName();
	int GetLevel();
}

class GameUser implements Game, Comparable<GameUser>{
	static int Cnt = 1;
	String name;
	int level;
	int Mynumber;

	public GameUser(String name, int level){
		this.name = name;
		this.level = level;
		this.Mynumber = Cnt++;
	}

	public String GetName(){
		return this.name;
	}

	public int GetLevel(){
		return this.level;
	}

	public int GetNumber(){
		return this.Mynumber;
	}

	//compareTo
	public int compareTo(GameUser o){
		return ((Integer)level).compareTo(o.level);
	}
}


public class Problem_3052 {
	public static void main(String[] args) {
		List<GameUser> list = new ArrayList<>();

		GameUser g1 = new GameUser("tom", 73);
		GameUser g2 = new GameUser("jisu", 92);
		GameUser g3 = new GameUser("hoal", 38);
		GameUser g4 = new GameUser("jirala", 102);
		GameUser g5 = new GameUser("kala", 62);

		list.add(g1);
		list.add(g2);
		list.add(g3);
		list.add(g4);
		list.add(g5);

		Collections.sort(list);

		for(GameUser s : list){
			System.out.printf("%d번 %s %d\n",s.Mynumber ,s.getClass().getSimpleName(),s.level);
		}
	}
}