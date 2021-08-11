import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Date;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	ArrayList<RequestQuotation> rqList;

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
	
	@Test
	public void viewPackageTest() {
		ArrayList<Package> PackageList = new ArrayList<Package>();
		assertNotNull("Test if there is valid Package arraylist to retrieve item", PackageList);
		
		//test if the list of Packages retrieved from the SourceCentre is empty - boundary
		String testOutput = "";
		assertEquals("Check that viewPackage is empty", testOutput, C206_CaseStudy.retrivePackages(PackageList));
		
		//test if the expected output string same as the list of Package retrieved from the C206_CaseStudy
		Date start = new Date();
		Date end = new Date();
		Package X = new Package("PK001","Test Package",  start , end, 3 );
		C206_CaseStudy.addPackage(PackageList, X);

		testOutput = String.format("%-10s %-10s %-10s %-10s %-10d \n","PK001", "Test Package",start.toString(), end.toString() , 3);
		
		assertEquals("Test that ViewAllCamcorderlist", testOutput, C206_CaseStudy.retrivePackages(PackageList));
		
	}
	
	@Test
	public void doDeletePackageTest() {
		ArrayList<Package> PackageList = new ArrayList<Package>();
		
		//boundary
		assertNotNull("test if there is valid Camcorder arraylist to loan from", PackageList);
		
		Date start = new Date();
		Date end = new Date();
		Package X = new Package("PK001","Test Package",  start , end, 3 );
		C206_CaseStudy.addPackage(PackageList, X);
		assertEquals("Check that Package arraylist size is 1", 1, PackageList.size());
		assertSame("Check that Package is added", X, PackageList.get(0));
		
		//test that the item is null after deleting it 
		C206_CaseStudy.doDeletePackage(PackageList, "PK001");
		
		assertSame("Check that the package is null", PackageList.get(0), null);
		
	}
	
	

	//Add Request for Quote
	public void addRequestQuotation() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Request for quotation arraylist to add to", rqList);
		
	}
	
	public void viewRequestQuotation() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Check if there is valid Request for Quotation arraylist to add to", rqList);
		
		
	}
	
	public void deleteRequestQuotation() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Check if there is valid Request for Quotation arraylist to delete from", rqList);

	}
}
	


