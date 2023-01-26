package services.products;

import lombok.Getter;

@Getter
public class UpdateProductResp {

    private  String title;
    private  int price;
    private  String description;
    private int categoryId;
    private String[] images;
}
