
public class EvaluateCells {
	private int cells[][];
	public EvaluateCells(int cells[][]){
		this.cells = cells;
		for(int i=0; i<cells.length; i++){
			for(int j=0; j<cells[i].length; j++){
				cells[i][j] = 0;
			}
		}
		cells[1][2] = 1;
	}
	
	public void loopCells(){
		for(int i=0; i<cells.length; i++){
			for(int j=0; j<cells[i].length; j++){
				System.out.print(cells[i][j] + "|");
			}
			System.out.println();
		}
	}	
}
