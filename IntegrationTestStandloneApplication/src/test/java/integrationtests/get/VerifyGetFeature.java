package integrationtests.get;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class VerifyGetFeature {

    @Test
    @JsonTestCase("integration_tests/get/get_new_customer_by_id_test.json")
    public void test_getNewCustomerDetailsById() throws Exception {
    }

    @Test
    @JsonTestCase("integration_tests/get/get_updated_customer_by_id_test.json")
    public void test_getUpdatedCustomerDetailsById() throws Exception {
    }

}
