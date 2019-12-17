package integrationtests.put;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class VerifyPutFeature {

    @Test
    @JsonTestCase("integration_tests/put/create_a_customer_test.json")
    public void test_createOrUpdateCustomer() throws Exception {
    }

    @Test
    @JsonTestCase("integration_tests/put/update_an_existing_customer_test.json")
    public void test_updateExistingCustomer() throws Exception {
    }

}
