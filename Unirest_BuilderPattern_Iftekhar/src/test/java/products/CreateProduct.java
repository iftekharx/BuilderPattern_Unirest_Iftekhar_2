package products;
import base.BaseTest;
import base.GatewayRequest;
import services.categories.CreateCategoryReq;
import services.categories.CreateCategoryResp;
import helpers.AssertHelper;
import helpers.MandatoryHeaders;
import org.testng.annotations.Test;
import services.products.CreateProductReq;
import services.products.CreateProductResp;

public class CreateProduct {
    @Test
    public void test_create_product(){
        String[] images = {"pic.png"};

        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .productsService()
                .createProduct(
                        CreateProductReq
                                .builder()
                                .title("abcd")
                                .price(200)
                                .description("asdasdasdas")
                                .categoryId(1)
                                .images(images)
                                .build())
                .send();

        CreateProductResp resp = (CreateProductResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseCode(gatewayRequest, 201);
        AssertHelper.assertResponseBodyContains("title", resp.getTitle(), "abcd");
    }
}
