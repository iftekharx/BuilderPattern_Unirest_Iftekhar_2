package services.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetSingleProductResp {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("price")
    @Expose
    public int price;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("images")
    @Expose
    public String[] images;


    @SerializedName("categoryId")
    @Expose
    public int categoryId;


}
