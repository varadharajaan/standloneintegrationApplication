package integrationtests.delete;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class VerifyDeleteOperation {

    @Test
    @JsonTestCase("integration_tests/delete/delete_existing_customer_by_id_test.json")
    public void test_deleteExistingCustomerDetailsById() throws Exception {
    }

    @Test
    @JsonTestCase("integration_tests/delete/delete_nonexisting_customer_test.json")
    public void test_getUpdatedCustomerDetailsById() throws Exception {
    }

}
