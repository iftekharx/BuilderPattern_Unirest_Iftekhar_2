package products;
import base.BaseTest;
import base.GatewayRequest;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.products.UpdateProductReq;
import services.products.UpdateProductResp;


public class UpdateProducts {
    @Test
    public void test_update_product(){
        String[] images = {"pic2.png"};
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .productsService()
                .updateProduct(UpdateProductReq.builder()
                        .id(22)
                        .title("abcd")
                        .images(images)
                        .price(300)
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        UpdateProductResp resp = (UpdateProductResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseBodyContains("price", resp.getPrice(), 300);
    }
}
