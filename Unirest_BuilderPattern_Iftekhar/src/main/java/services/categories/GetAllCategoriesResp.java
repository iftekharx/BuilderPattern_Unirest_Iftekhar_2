package services.categories;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetAllCategoriesResp {

    private List<Category> categories;

    @Getter
    public class Category{

        @SerializedName("id")
        private int id;

        @SerializedName("name")
        private String name;

        @SerializedName("image")
        private String image;


    }
}
