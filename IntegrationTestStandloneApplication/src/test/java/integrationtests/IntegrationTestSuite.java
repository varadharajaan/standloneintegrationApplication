package integrationtests;

import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.TestPackageRoot;
import org.jsmart.zerocode.core.runner.ZeroCodePackageRunner;
import org.junit.runner.RunWith;

/**
 * IntegrationTestSuite runs all the tests as a suite by picking all the tests
 * from "resources/integration_tests" folder and sub-folders.
 * <p>
 * To run individual tests, go to the corresponding package and run the test as JUnit
 * e.g. go to folders >> get, put etc under "src/test/java/integrationtests"
 * and run-
 * - integrationtests.get.VerifyGetFeature.java
 * - integrationtests.put.VerifyPutFeature.java
 * - integrationtests.delete.VerifyDeleteOperation.java
 * - integrationtests.uploadfile.VerifyFileUpload.java
 */
@TargetEnv("application_host.properties")
@TestPackageRoot("integration_tests") //picks all tests from this folder and subfolders
@RunWith(ZeroCodePackageRunner.class)
public class IntegrationTestSuite {

}
