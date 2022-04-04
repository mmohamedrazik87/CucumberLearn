package learnRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	int count =0;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<3){
			count++;
			return true;
		}
		return false;
	}

}
