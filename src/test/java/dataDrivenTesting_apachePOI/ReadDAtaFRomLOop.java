package dataDrivenTesting_apachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDAtaFRomLOop {
	public static void main(String[]args) throws Exception {
		File src = new File("D:\\ECLIPSE dxc phase 2\\DataDrivenTesting_apachePOI\\Excel_file\\ORangeHRMTEst_data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount =sheet1.getLastRowNum();
		System.out.println("Total Rows are:..."+ rowcount+1);
		
		for(int i =0; i<=rowcount;i++) {
			XSSFRichTextString data1= sheet1.getRow(i).getCell(0).getRichStringCellValue();
			System.out.println("Data frow row"+i+" is .."+data1);
			
			XSSFRichTextString data2= sheet1.getRow(i).getCell(1).getRichStringCellValue();
			System.out.println("Data frow row"+i+" is .."+data2);	
		}
		
		wb.close();
}
}