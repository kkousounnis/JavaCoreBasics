package datetime;
import java.time.*;
import java.time.Year;
import java.util.Calendar;
import java.util.Locale; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fyear = 2016;
		int lyear = 2020;
		int d=  lyear - fyear;
		String day = "";
		String month = "";
		String q[] = new String[2];
		int counter = 0;
		String lastmonth="";

        int maxDay = 0;
		Calendar cal = Calendar.getInstance();
		for(int k=0; k <= d; k++ ) {
			 System.out.println((fyear+k)+"\n");
			for (int i=0; i < 12; i++) {
				cal.set(fyear+k, i, 1);				
				month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
				day = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());

		        maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
				//System.out.println((fyear+k)+" the first day of "+month+" is "+day);
				if(day.contentEquals("Friday" ) & maxDay==31) {
					//System.out.println((fyear+k)+" the first day of "+month+" is "+day + "TotalDays"+maxDay);
					if(counter == 0) q[counter] = month.toUpperCase();
					lastmonth=month;
					counter++;
				}
				
			}
		}
		q[1]=lastmonth.toUpperCase();
		System.out.println(q[0]+" "+q[1]+" "+counter);
	}

}
//January, December