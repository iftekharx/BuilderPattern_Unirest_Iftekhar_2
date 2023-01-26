package categories;

import base.BaseTest;
import base.GatewayRequest;
import services.categories.UpdateCategoryReq;
import services.categories.UpdateCategoryResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class UpdateCategories extends BaseTest {

    @Test
    public void test_update_category(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .categoriesService()
                .updateCategory(UpdateCategoryReq.builder()
                        .id(1)
                        .name("abcd")
                        .image("https://api.lorem.space/image/fashion?w=640&h=480&r=3357")
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        UpdateCategoryResp resp = (UpdateCategoryResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseBodyContains("image", resp.getImage(), "https://api.lorem.space/image/fashion?w=640&h=480&r=3357");
    }
}
