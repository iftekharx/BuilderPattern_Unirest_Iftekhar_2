package categories;

import base.BaseTest;
import base.GatewayRequest;
import services.categories.CreateCategoryReq;
import services.categories.CreateCategoryResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class CreateCategory {

    @Test
    public void test_create_category(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .categoriesService()
                .createCategory(
                        CreateCategoryReq
                                .builder()

                                .name("abcd")
                                .image("https://api.lorem.space/image/fashion?w=640&h=480&r=3357")
                                .build())
                .send();

        CreateCategoryResp resp = (CreateCategoryResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseCode(gatewayRequest, 201);
        AssertHelper.assertResponseBodyContains("name", resp.getName(), "abcd");
    }
}
