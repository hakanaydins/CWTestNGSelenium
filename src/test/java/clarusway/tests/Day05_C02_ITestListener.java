package clarusway.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Day05_C02_ITestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart methodu calisti");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess methodu calisti");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure methodu calisti");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped methodu calisti");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage methodu calisti");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout methodu calisti");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart methodu calisti");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish methodu calisti");
    }
}