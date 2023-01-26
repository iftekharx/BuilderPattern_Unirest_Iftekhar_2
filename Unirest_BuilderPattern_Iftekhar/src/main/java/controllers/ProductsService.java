package controllers;

import base.GatewayRequest;
import services.products.*;

public class ProductsService {
    private GatewayRequest gatewayRequest;

    public ProductsService(GatewayRequest gatewayRequest){
        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest getSingleProduct(GetSingleProductReq getSingleProductReq){
        gatewayRequest.setBody(getSingleProductReq);
        gatewayRequest.setResponseObjectType(GetSingleProductResp.class);
        return gatewayRequest;
    }

    public GatewayRequest getAllProducts(GetAllProductsReq getAllProductsReq){
        gatewayRequest.setBody(getAllProductsReq);
        gatewayRequest.setResponseObjectType(GetAllProductsResp.class);
        return gatewayRequest;
    }

    public GatewayRequest createProduct(CreateProductReq createProductReq){
        gatewayRequest.setBody(createProductReq);
        gatewayRequest.setResponseObjectType(CreateProductResp.class);
        return gatewayRequest;
    }

    public GatewayRequest updateProduct(UpdateProductReq updateProductReq){
        gatewayRequest.setBody(updateProductReq);
        gatewayRequest.setResponseObjectType(UpdateProductResp.class);
        return gatewayRequest;
    }
}
