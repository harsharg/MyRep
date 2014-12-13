package Amazon;

import java.io.File;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfComparison 
{
	
	public static String texttosearch="Account";
	public static boolean searchResult=false;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file = "C:\\Users\\harsharg\\Desktop\\April2013.pdf";
		// Create a PdfWriter instance
		PdfReader w = new PdfReader("C:\\Users\\harsharg\\Desktop\\April2013.pdf");
		System.out.println(w.getNumberOfPages());
		for(int i=1;i<=w.getNumberOfPages();i++)
		{
			String page = PdfTextExtractor.getTextFromPage(w, i);
		//	System.out.println(w.getPageContent(i));
			System.out.println(page);
			
		}
		//.getNumberOfPages()

		// Create a PdfDocument instance with the PdfWriter
	//	PdfDocument d = new PdfDocument(w);

		// Write some text on page 1
	//	d.writeText("Hello, World!");

		// Write document to file
	//	d.write();

		// Close all I/O streams associated with the PDF writer
	//	w.dispose();


	}

}
