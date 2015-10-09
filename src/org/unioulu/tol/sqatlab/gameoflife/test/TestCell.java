package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeiberhodShouldDie() {
		//arrange
		Cell cell =new Cell("Alive");
		//
		cell.nextIteration(0);
		//assert
		assertEquals("Dead", cell.getState());
	}
	
	@Test
	public void testLiveCellWithNoNeiberhodShouldLive() {
		//arrange
		Cell cell =new Cell("Alive");
		//
		cell.nextIteration();
		//assert
		assertEquals("Alive", cell.getState());
	}

}
