package controllers;

import base.GatewayRequest;
import services.categories.*;

public class CategoriesService {
    private GatewayRequest gatewayRequest;

    public CategoriesService(GatewayRequest gatewayRequest){
        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest getSingleCategory(GetSingleCategoryReq getSingleCategoryReq){
        gatewayRequest.setBody(getSingleCategoryReq);
        gatewayRequest.setResponseObjectType(GetSingleCategoryResp.class);
        return gatewayRequest;
    }

    public GatewayRequest getAllCategories(GetAllCategoriesReq getAllCategoriesReq){
        gatewayRequest.setBody(getAllCategoriesReq);
        gatewayRequest.setResponseObjectType(GetAllCategoriesResp.class);
        return gatewayRequest;
    }

    public GatewayRequest createCategory(CreateCategoryReq createCategoryReq){
        gatewayRequest.setBody(createCategoryReq);
        gatewayRequest.setResponseObjectType(CreateCategoryResp.class);
        return gatewayRequest;
    }

    public GatewayRequest updateCategory(UpdateCategoryReq updateCategoryReq){
        gatewayRequest.setBody(updateCategoryReq);
        gatewayRequest.setResponseObjectType(UpdateCategoryResp.class);
        return gatewayRequest;
    }
}
