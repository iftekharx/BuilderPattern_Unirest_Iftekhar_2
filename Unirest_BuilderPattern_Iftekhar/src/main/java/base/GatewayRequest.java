package base;

import controllers.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.request.HttpRequest;
import services.categories.GetSingleCategoryReq;
import services.categories.GetSingleCategoryResp;
import services.products.GetSingleProductReq;
import services.products.GetSingleProductResp;
import services.users.GetSingleUserReq;
import services.users.GetSingleUserResp;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GatewayRequest {

    @Getter(AccessLevel.PUBLIC)
    private HttpHeader headers = new HttpHeader();
    @Setter
    @Getter(AccessLevel.PROTECTED)
    private AbstractHttpSpecification body;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private HttpRequest httpRequest;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private HttpResponse httpResponse;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private Object serializedResponse;
    @Setter
    @Getter(AccessLevel.PROTECTED)
    private Class responseObjectType;


    public GatewayRequest forService() {
        return this;
    }

    public GatewayRequest usingHeaders(final HttpHeader httpHeader) {
        this.headers = httpHeader;
        return this;
    }

    public GatewayRequest getSingleProduct(final GetSingleProductReq singleProductReq) {
        body = singleProductReq;
        responseObjectType = GetSingleProductResp.class;
        return this;
    }

    public GatewayRequest getSingleCategory(final GetSingleCategoryReq singleCategoryReq) {
        body = singleCategoryReq;
        responseObjectType = GetSingleCategoryResp.class;
        return this;
    }

    public GatewayRequest getSingleUser(final GetSingleUserReq singleUserReq) {
        body = singleUserReq;
        responseObjectType = GetSingleUserResp.class;
        return this;
    }

    public ProductsService productsService() {
        return new ProductsService(this);
    }

    public CategoriesService categoriesService() {
        return new CategoriesService(this);
    }

    public UserService userService() {
        return new UserService(this);
    }

    public GatewayRequest send() {
        new HttpDispatcher().send(this);
        return this;
    }
}
