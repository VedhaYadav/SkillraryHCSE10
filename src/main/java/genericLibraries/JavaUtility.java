package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * this class contains reusable methods of java
 * @author Prakash Chandrappa
 *
 */

public class JavaUtility {
	/**
	 * this method genarate random no.within the limit
	 * @param limit
	 * @return
	 */
	public int generateRandowmNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
		
	}
	/**
	 * this method get system date
	 * @return
	 */
	public String getCurrenttime() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_mm_yy_hh_mm_sss");
		return sdf.format(date);
		
		
	}

}
