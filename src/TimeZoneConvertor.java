/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author arpitparikh
 */
public class TimeZoneConvertor {
    
    
    public String convert(String input,String timezone) throws Exception{

    	
                String dateString1 = input;
		 String[] splitString = dateString1.split(" ");
		
		 String dat = splitString[0];
		 String time = splitString[1];
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");

		String dateInString =dat+" "+time;
		Date date = formatter.parse(dateInString);
		TimeZone tz = TimeZone.getTimeZone("EST");

		// From est
		System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
		System.out.println("TimeZone : " + tz);
		System.out.println("Date : " + formatter.format(date));

                if("CST".equals(timezone)){
		// To cst
		SimpleDateFormat sdfAmerica = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
		TimeZone tzInAmerica = TimeZone.getTimeZone("CST");
		sdfAmerica.setTimeZone(tzInAmerica);
		String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
		Date dateInAmerica = formatter.parse(sDateInAmerica);
		System.out.println("Date (String) : " + sDateInAmerica);
		System.out.println("Date (Object) : " + formatter.format(dateInAmerica)); 
		  return sDateInAmerica;
                }
		//to AST
                if("AST".equals(timezone))
                {
		SimpleDateFormat sdfAST = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
		TimeZone tzInAST = TimeZone.getTimeZone("AST");
		sdfAST.setTimeZone(tzInAST);
		String sDateInAST = sdfAST.format(date); // Convert to String first
		Date dateInAST = formatter.parse(sDateInAST);
		System.out.println("Date (String) : " + sDateInAST);
		System.out.println("Date (Object) : " + formatter.format(dateInAST));
		return sDateInAST;
                }
		//To ACDT
                if("ACDT".equals(timezone)){
                
		SimpleDateFormat sdfACDT = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
		TimeZone tzInACDT = TimeZone.getTimeZone("ACDT");
		sdfACDT.setTimeZone(tzInACDT);
		String sDateInACDT = sdfACDT.format(date); // Convert to String first
		Date dateInACDT = formatter.parse(sDateInACDT);
		System.out.println("Date (String) : " + sDateInACDT);
		System.out.println("Date (Object) : " + formatter.format(dateInACDT));    
                     return sDateInACDT;
    
                }else{
                    
                    return null;
                }
    
    }
    
    
    
    
    
}
