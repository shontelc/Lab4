package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.Test;

import javafx.scene.control.Cell;

public class SudokuPrivateMethodsTest {

	private void PrintStars() {
		for (int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
	}
	/*
	@Test
	public void Sudoku_Test_SetRegion() {

		Sudoku s1 = null;
		int iPuzzleSize = 9;
		int[] iExpectedRegion = new int[iPuzzleSize];
		for (int i = 0; i < iPuzzleSize; i++) {
			iExpectedRegion[i] = i + 1;
		}
		int[] iActualRegion;

		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(iPuzzleSize);

			Method mSetRegion = c.getDeclaredMethod("SetRegion", new Class[] { int.class });

			PrintStars();
			System.out.println("Testing method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			System.out.println("Original Puzzle:");
			s1.PrintPuzzle();
			System.out.println("Original Region 0:");
			System.out.println(Arrays.toString(s1.getRegion(0)));

			System.out.println("Set Puzzle:");
			mSetRegion.setAccessible(true);
			mSetRegion.invoke(s1, 0);
			iActualRegion = s1.getRegion(0);

			s1.PrintPuzzle();
			System.out.println(Arrays.toString(s1.getRegion(0)));

			assertTrue(Arrays.equals(iExpectedRegion, iActualRegion));

			PrintStars();

		} catch (ClassNotFoundException e1) {
			fail("ClassNotFoundException");
		} catch (NoSuchMethodException e) {
			fail("NoSuchMethodException");
		} catch (SecurityException e) {

			fail("SecurityException");
		} catch (InstantiationException e) {
			fail("InstantiationException");
		} catch (IllegalAccessException e) {
			fail("IllegalAccessException");
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (InvocationTargetException e) {
			fail("InvocationTargetException, Invalid size");
		}

		PrintStars();

	}

	@Test
	public void FillDiagonalRegions() {
		
		Sudoku s1 = null;
		int iPuzzleSize = 9;
		
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(iPuzzleSize);

			Method mFillDiagonalRegions = c.getDeclaredMethod("FillDiagonalRegions", null);

			PrintStars();
			System.out.println("Testing method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			System.out.println("Original Puzzle:");
			s1.PrintPuzzle();
			System.out.println("Original Region 0:");
			System.out.println(Arrays.toString(s1.getRegion(0)));

			System.out.println("Set Puzzle:");
			mFillDiagonalRegions.setAccessible(true);
			mFillDiagonalRegions.invoke(s1, null);

			s1.PrintPuzzle();
			System.out.println(Arrays.toString(s1.getRegion(0)));

			PrintStars();

		} catch (ClassNotFoundException e1) {
			fail("ClassNotFoundException");
		} catch (NoSuchMethodException e) {
			fail("NoSuchMethodException");
		} catch (SecurityException e) {

			fail("SecurityException");
		} catch (InstantiationException e) {
			fail("InstantiationException");
		} catch (IllegalAccessException e) {
			fail("IllegalAccessException");
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (InvocationTargetException e) {
			fail("InvocationTargetException, Invalid size");
		}
		
	}
	*/
	
	/*
	@Test
	public void CellgetNextCell_Test1() 
	{
		try
		{
			Class<?> c = Class.forName("pkgGame.Sudoku.Cell");
			Constructor constructor = c.getConstructor(new Class[] {int.class});
			constructor.setAccessible(true);
			
			Cell cell = new Cell();
			
			int iCol = 3; 
			int iRow = 1;
			cell = (Cell)constructor.newInstance(iCol, iRow);
			
			Method mgetNextCell = c.getDeclaredMethod("getNextCell", null);
			
			mgetNextCell.invoke(cell, null);
			
		} catch (ClassNotFoundException e1) {
			fail("ClassNotFoundException");
		} catch (NoSuchMethodException e) {
			fail("NoSuchMethodException");
		} catch (SecurityException e) {

			fail("SecurityException");
		} catch (InstantiationException e) {
			fail("InstantiationException");
		} catch (IllegalAccessException e) {
			fail("IllegalAccessException");
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (InvocationTargetException e) {
			fail("InvocationTargetException, Invalid size");
		}
		
	}*/
}
