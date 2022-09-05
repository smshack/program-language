package lecture34.ex1;

import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.poi.hslf.examples.CreateHyperlink;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx {
public static void main(String[] args) {
	try {
		
		//create workbook in .xlsx format
		Workbook workbook = new XSSFWorkbook();
		
		//For .xsl workbooks use new HSSFWorkbook();
		//create sheet
		Sheet sh = workbook.createSheet("Invoices");
		
		//create top row with column headings
		String [] columnHeadings = {"Item id","Item Name" ,"Qty","Item Price","Sold Date"};
		
		//We want to make it bold wiith a foreground color
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeight((short)12);
		headerFont.setColor(IndexedColors.BLACK.index);
		//create a cellstyle with the font
		CellStyle headerStyle = workbook.createCellStyle();
		
		headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
		//create the header row
		Row headerRow =sh.createRow(0);
		
		//Iterate over the column headings to create columns
		for (int i = 0; i < columnHeadings.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columnHeadings[i]);
			cell.setCellStyle(headerStyle);
		}
		
		//Freeze Header Row
		sh.createFreezePane(0, 1);
		
		//Fill data
		ArrayList<Ivoices> a = createData();
		CreationHelper creationHelper = workbook.getCreationHelper();
		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(creationHelper.createDataFormat().getFormat("MM/dd/yyyy"));
		
		int rownum =1;
		
		for (Ivoices i: a) {
			Row row = sh.createRow(rownum++);
			row.createCell(0).setCellValue(i.getItemId());
			row.createCell(1).setCellValue(i.getItemName());
			row.createCell(2).setCellValue(i.getItemQty());
			row.createCell(3).setCellValue(i.getTotalPrice());
			
			Cell dateCell = row.createCell(4);
			dateCell.setCellValue(i.getItemSoldDate());
			dateCell.setCellStyle(dateStyle);
		}
		//Group and collapse rows
		int noOfRows = sh.getLastRowNum();
		sh.groupRow(1, noOfRows);
		sh.setRowGroupCollapsed(1, true);
		
		
		
		//create a sum row
		Row sumRow = sh.createRow(rownum);
		Cell sumRowtitle = sumRow.createCell(0);
		sumRowtitle.setCellValue("Total");
		sumRowtitle.setCellStyle(headerStyle);
		
		String strRormual ="SUM(D2:D"+rownum+")";
		Cell sumcell = sumRow.createCell(3);
		sumcell.setCellFormula(strRormual);
		sumcell.setCellValue(true);
		
		
		//Autosize columns
		for (int i = 0; i < columnHeadings.length; i++) {
			sh.autoSizeColumn(i);
		}
		
		Sheet sh2 = workbook.createSheet("Second");
		//Write the output to file
		FileOutputStream fileOut = new FileOutputStream("D:\\ivoice.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
		System.out.println("complete!!!");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}

private static ArrayList<Ivoices> createData() throws ParseException {
	ArrayList<Ivoices> a = new ArrayList();
	
	a.add(new Ivoices(1, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(2, "Table", 4, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(3, "Lamp", 45, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(4, "Pen", 5, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(5, "Book", 3, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(6, "Table", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(7, "Lamp", 5, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(8, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(9, "Pen", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(10, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(11, "Pen", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(12, "Lamp", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(13, "Table", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(14, "Table", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(15, "Book", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	a.add(new Ivoices(16, "Lamp", 2, 10.0, new SimpleDateFormat("MM/dd/yyyy").parse("01/01/2020")));
	
	
	
	return a;
	
	
}
}
