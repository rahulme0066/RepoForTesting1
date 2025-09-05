package test_scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_utility.ExcelUtility;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import pojoUtility.ProjectPojo;

public class SampleTest {
	
	@Test(dataProvider = "getData")
	public void createProject(String ProjectName,String ProjectManager ,String teamSize ,String Status) {
		ProjectPojo pObj=new ProjectPojo(ProjectName,Status,ProjectManager,teamSize);
		given().contentType(ContentType.JSON).body(pObj).when().post("http://49.249.28.218:8091/addProject").then().log().all();
		System.out.println(ProjectName+"  "+ProjectManager+" "+teamSize+" "+Status);
		
	}
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		ExcelUtility elib=new ExcelUtility();
		int rowCount = elib.getrowCount("Sheet1");
		System.out.println(rowCount);
		Object[][] objArr=new Object[rowCount][4];
		for(int i=0;i<rowCount;i++) {
		objArr[i][0]=elib.getDataFromExcel("Sheet1", i+1, 0);
		objArr[i][1]=elib.getDataFromExcel("Sheet1", i+1, 1);
		objArr[i][2]=elib.getDataFromExcel("Sheet1", i+1, 2);
		objArr[i][3]=elib.getDataFromExcel("Sheet1", i+1, 3);
		}		
		return objArr;
		
		
	}

}
