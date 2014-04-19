
public class CellularAutomation {
	public static void main(String[] arg){		
		int cells[][] = new int[5][5];
		EvaluateCells evaluate = new EvaluateCells(cells);
		evaluate.loopCells();
	}
}
