package lecture34.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
	private static String[] columns = {"First Name","Last Name","Email","Date of Birth"};
	private static List<Contact> contacts = new ArrayList<Contact>();
	
	public static void main(String[] args) throws IOException {
		contacts.add(new Contact("Sylvain","Sourel","sylvain.sourel@gmail.com","17/01/1980"));
		contacts.add(new Contact("Albert","Dupond","sylvain.sourel@gmail.com","17/01/1980"));
		contacts.add(new Contact("Johnny","clegg","sylvain.sourel@gmail.com","17/01/1980"));
		contacts.add(new Contact("Rob","Robby","sylvain.sourel@gmail.com","17/01/1980"));
		contacts.add(new Contact("Dream","Dreamer","sylvain.sourel@gmail.com","17/01/1980"));
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Contacts");
		
		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeight((short)17);
		headerFont.setColor(IndexedColors.RED.getIndex());
		
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		Row headerRow =sheet.createRow(0);
		
		for(int i =0; i<columns.length;i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
		}
		
		int rowNum = 1;
		for(Contact contact: contacts) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(contact.firstName);
			row.createCell(0).setCellValue(contact.lastName);
			row.createCell(0).setCellValue(contact.email);
			row.createCell(0).setCellValue(contact.dateOfBirth);
		}
		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}
		
		FileOutputStream fileOut = new FileOutputStream("D:\\Contacts.xlsx");
		workbook.write(fileOut);
		fileOut.close();
		workbook.close();
		
	}
	
}
