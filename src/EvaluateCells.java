
public class EvaluateCells {
	private int cells[][];
	int n1 = 0;
	int n2 = 0;
	int N = 0;
	public EvaluateCells(int cells[][]){
		this.cells = cells;
		n1 = this.cells.length;
	}
	
	public void loopCells(){
		for(int i=0; i<n1; i++){
			for(int j=0; j>cells[i].length; j++){
				if(evaluateNeighboors(i, j)){
					cells[i][j] = 1;
				}else{
					cells[i][j] = 0;
				}
			}
		}
	}
	
	private boolean evaluateNeighboors(int i, int j){
		if(i > 0 && j > 0 && i < n1 && j < cells[0].length){
			
		}
		return true;
	}
}
