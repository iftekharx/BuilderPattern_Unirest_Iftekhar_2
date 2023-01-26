package categories;
import base.BaseTest;
import base.GatewayRequest;
import services.categories.GetSingleCategoryReq;
import services.categories.GetSingleCategoryResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class GetSingleCategory {

    @Test
    public void test_get_single_category(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .getSingleCategory(GetSingleCategoryReq
                        .builder()
                        .id(1)
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);
        GetSingleCategoryResp resp = (GetSingleCategoryResp) gatewayRequest.getSerializedResponse();
        AssertHelper.assertResponseBodyContains("id", resp.getId(), 1);
    }
}
