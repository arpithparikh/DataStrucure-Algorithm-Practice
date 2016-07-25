//1.Anagram
//2. BackTracking of the fiding the word

import java.awt.List;
import java.util.ArrayList;

class Point{
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class SearchWords {
	public static void main(String[] ars){
		char board[][] = {{'w','o','r','d'},
				{'a','b','c','d'},
				{'w','o','r','d'},
				{'o','r','d','e'}};
		String word = "word";
		ArrayList<ArrayList<Point>> res = new ArrayList<ArrayList<Point>>();
		ArrayList<Point> path = new ArrayList<Point>();
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				ArrayList<Point> list = new ArrayList<Point>();
				findWord(board, i, j, word, res, list, 0);
			}
		}
		for(ArrayList<Point> list : res){
			for(Point point : list){
				System.out.print("(");
				System.out.print(point.x + ",");
				System.out.print(point.y);
				System.out.print("),");
			}
			System.out.println();
		}
		
	}
	public static void findWord(char[][] board, int x_start, int y_start, String word, ArrayList<ArrayList<Point>> res, ArrayList<Point> list, int index){
		if(x_start < 0 || x_start >= 4 || y_start < 0 || y_start >= 4){
			return;
		}
		if(index == word.length()){
			res.add(new ArrayList<Point>(list));
		}
		for(int i = index; i < word.length(); i++){
			if(word.charAt(i) != board[x_start][y_start]){
				break;
			}
			list.add(new Point(x_start, y_start));
			findWord(board, x_start+1, y_start+1, word, res, list, index+1);
			findWord(board, x_start, y_start+1, word, res, list, index+1);
			findWord(board, x_start+1, y_start, word, res, list, index+1);
			findWord(board, x_start+1, y_start-1, word, res, list, index+1);
			findWord(board, x_start-1, y_start+1, word, res, list, index+1);
			findWord(board, x_start-1, y_start-1, word, res, list, index+1);
			findWord(board, x_start-1, y_start, word, res, list, index+1);
			findWord(board, x_start, y_start-1, word, res, list, index+1);
			list.remove(list.size()-1);
		}
		
	}
}
