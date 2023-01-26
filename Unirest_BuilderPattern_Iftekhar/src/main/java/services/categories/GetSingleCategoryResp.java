package services.categories;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class GetSingleCategoryResp {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("image")
    private String image;

}
