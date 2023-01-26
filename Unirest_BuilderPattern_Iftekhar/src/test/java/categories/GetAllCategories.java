package categories;

import base.BaseTest;
import base.GatewayRequest;
import services.categories.GetAllCategoriesReq;
import services.categories.GetAllCategoriesResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;


public class GetAllCategories {

    @Test
    public void test_get_all_categories() {
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .categoriesService()
                .getAllCategories(GetAllCategoriesReq.builder().build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        System.out.println(gatewayRequest.getHttpResponse().getBody());
    }
}
