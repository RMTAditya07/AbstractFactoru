public abstract class Tech {
    public abstract TestCase createTestCase();
    
    public TestCase executeTestCase() {
        TestCase testCase = createTestCase();
        testCase.execute();
        return testCase;
    }
}