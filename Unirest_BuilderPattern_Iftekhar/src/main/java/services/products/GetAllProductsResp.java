package services.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import services.categories.GetAllCategoriesResp;

import java.util.List;


public class GetAllProductsResp {
    private List<GetAllCategoriesResp.Category> categories;

    @Getter
    public class Product{

        @SerializedName("id")
        private int id;

        @SerializedName("title")
        private String name;

        @SerializedName("price")
        private int price;

        @SerializedName("description")
        private String description;

        @SerializedName("images")
        private String[] images;


        @SerializedName("categoryId")
        private int categoryId;


    }
}
