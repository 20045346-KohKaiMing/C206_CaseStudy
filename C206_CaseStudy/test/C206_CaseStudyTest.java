import static org.junit.Assert.*;

import java.util.ArrayList;

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

