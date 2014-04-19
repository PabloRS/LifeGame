
public class CellularAutomation {
	public static void main(String[] arg){
		int n1 = 0, n2 = 0;
		int cells[][] = new int[n1][n2];
		EvaluateCells evaluate = new EvaluateCells(cells);
		evaluate.loopCells();
	}
}
