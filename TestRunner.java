import org.junit.runner.JunitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public static void main(String[] args) {
		Result result = JunitCore.runClass(TestJunit.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
