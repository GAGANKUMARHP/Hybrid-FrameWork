package Generic_script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class singl_read extends Basetest
{
	public  static String  fetch(String sheet,int row,int cel)
	{
	String val=" ";

try
{
	FileInputStream fs= new FileInputStream("./exel/testdata.xlsx");
    Workbook b=WorkbookFactory.create(fs);
    Sheet sh = b.getSheet(sheet);
    Row r = sh.getRow(row);
    Cell ce = r.getCell(cel);
    String va = ce.toString();
    System.out.println(va);
}
catch(Exception e)
{
	System.out.println("unable to open");
}
return val;
}
}