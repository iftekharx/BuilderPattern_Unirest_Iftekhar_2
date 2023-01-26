package services.products;

import lombok.Getter;

@Getter
public class CreateProductResp {

    private String title;
    private int price;
    private int id;
    private String description;
    private int categoryId;
    private String[] images;
}
