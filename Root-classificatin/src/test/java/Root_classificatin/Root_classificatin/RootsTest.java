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

	
	
	
	
	
	
	
	
	
	
	
	

	}
