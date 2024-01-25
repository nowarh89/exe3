package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
    
	@Test
	public void test_a_min() 
	{
	  Roots.calculate_roots(0, 35, 25);
		String  root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_a_min_plus1() 
	{
	  Roots.calculate_roots(1, 3, 80);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_a_nominal() 
	{
	  Roots.calculate_roots(45, 33, 37);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_a_max_minus1() 
	{
	  Roots.calculate_roots(100, 10, 70);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_a_max() 
	{
	  Roots.calculate_roots(100, 10, 70);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_b_min() 
	{
	  Roots.calculate_roots(50, 0,25);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_b_min_plus_1() 
	{
	  Roots.calculate_roots(70, 1,22);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	
	@Test
	public void test_b_nominal() 
	{
	  Roots.calculate_roots(77, 48,31);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	public void test_b_max_minus1() 
	{
	  Roots.calculate_roots(5, 99, 88);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_b_max() 
	{
	  Roots.calculate_roots(15, 100, 20);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_c_min() 
	{
	  Roots.calculate_roots(15, 70, 0);
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_c_min_plus1() 
	{
	  Roots.calculate_roots(4, 4, 1);
		String  root_expected = Root_Types.Equal_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_c_nominal() 
	{
	  Roots.calculate_roots(35, 80, 52);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_c_max_minus1() 
	{
	  Roots.calculate_roots(74, 88, 99);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	
	@Test
	public void test_c_max() 
	{
	  Roots.calculate_roots(47, 23, 100);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_c_stress_max_plus1() 
	{
	  Roots.calculate_roots(5, 70, 101);
		String  root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	@Test
	public void test_a_stress_min_minus1() 
	{
	  Roots.calculate_roots(-1, 32, 37);
		String  root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, Roots.root_types().toString());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testPartion1() 
	{
		//(0,1,2)
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	}
