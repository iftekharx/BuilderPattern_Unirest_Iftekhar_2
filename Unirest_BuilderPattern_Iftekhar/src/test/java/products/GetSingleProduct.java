package products;

import base.BaseTest;
import base.GatewayRequest;
import services.categories.GetSingleCategoryReq;
import services.categories.GetSingleCategoryResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.products.GetSingleProductReq;


public class GetSingleProduct {

    @Test
    public void test_get_single_product(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .getSingleProduct(GetSingleProductReq
                        .builder()
                        .id(1)
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);
        GetSingleCategoryResp resp = (GetSingleCategoryResp) gatewayRequest.getSerializedResponse();
        AssertHelper.assertResponseBodyContains("id", resp.getId(), 1);
    }
}
