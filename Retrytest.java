package testngfullpackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrytest implements IRetryAnalyzer{

	public int maxretry=3;
	 public int retrycase=0;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess() && retrycase < maxretry)
		{
			retrycase++;
			return true;
		}
		return false;
	}


}
