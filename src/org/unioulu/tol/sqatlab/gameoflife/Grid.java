package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {

	private Set<Cell> cells = new HashSet<Cell>();

	public int getNeighbors(Cell cell) {
		int numNeighbors=0;
//		Set<Cell> neighbours =new HashSet<Cell>();
		Set<Cell> neighbourhood =new HashSet<Cell>();

		for(int i=-1; i<=1; i++){
			Cell neighbor=new Cell(cell.x, cell.y+1);
			if(cells.contains(neighbor)){
				 numNeighbors++;
			}
		}
		
		return numNeighbors-1;
	}

	public void addCell(Cell cell) {
		cells.add(cell);
	}

}
