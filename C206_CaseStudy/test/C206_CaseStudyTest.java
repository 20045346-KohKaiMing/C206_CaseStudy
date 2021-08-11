import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Date;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private RequestQuotation rq1;
	private RequestQuotation rq2;
	ArrayList<RequestQuotation> rqList;
	

	@Before
	public void setUp() throws Exception {
		//prepare test data
		rq1 = new RequestQuotation("HDB", 40.5, "testrequest", 88888888, "test@gmail.com", 10000,
				LocalDate.of(2021, 8, 11), "room", 4, 4, "-", "urgent");
		rq2 = new RequestQuotation("private", 30.5, "testrequest2", 88888888, "test123@gmail.com", 40000,
				LocalDate.of(2021, 8, 30), "kitchen", 5, 2, "-", "urgent");
		rqList = new ArrayList<RequestQuotation>();
		
	}

	@After
	public void tearDown() throws Exception {
		rq1 = null;
		rqList = null;
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
		// List is not null, so that can add a new request for quote - boundary
		assertNotNull("Check if there is valid Request for Quotation arraylist to add to", rqList);

		// Given an empty list, after adding 1 Request for Quote, the size of the
		// list is 1 - normal
		// The Request for Quotation just added is as same as the first Request for
		// Quote of the list
		rqList.add(rq1);
		assertEquals("Test that Request for Quotation arraylist size is 1", 1, rqList.size());
		assertSame("Test that Request for Quotation is added", rq1, rqList.get(0));

		// Add another Request for Quote. test The size of the list is 2? -normal
		// The item just added is as same as the second Request for Quote of the
		// list
		rqList.add(rq2);
		assertEquals("Test that Request for Quotation arraylist size is 2", 2, rqList.size());
		assertSame("Test that Request for Quotation is added", rq2, rqList.get(0));
		
	}
	
	public void viewRequestQuotation() {
		//List is not null, so that can view all request for quote - boundary
		assertNotNull("Check if there is valid Request for Quotation arraylist to view from", rqList);
		
		//Given an empty list, after adding 2 Request for Quote, test if the size of the list is 2 - normal
		rqList.add(rq1);
		rqList.add(rq2);
		assertEquals("Test that Request for Quotation arraylist size is 2", 2, rqList.size());
				
		
	}
	
	public void deleteRequestQuotation() {
//		list is not null, so that can delete a request for quote - boundary
		assertNotNull("Check if there is valid Request for Quotation arraylist to delete from", rqList);

	}
}
	


