import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	
	@Test
	public void addPackageTest() {
		
		ArrayList<Package> PackageList = new ArrayList<Package>();
		
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", PackageList);
		Date start = new Date();
		Date end = new Date();
		Package X = new Package("PK001","Test Package",  start , end, 3 );
		Package Y = new Package("PK002","Test Package 2",  start , end, 7 );
		
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addPackage(PackageList, X);
		assertEquals("Check that Package arraylist size is 1", 1, PackageList.size());
		assertSame("Check that Package is added", X, PackageList.get(0));
				
		
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPackage(PackageList, Y);
		assertEquals("Check that Package arraylist size is 2", 2, PackageList.size());
		assertSame("Check that Package is added", Y, PackageList.get(1));
		
		
			}
	}


