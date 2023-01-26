package services.products;

import base.AbstractHttpSpecification;
import base.Properties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mashape.unirest.http.HttpMethod;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
@Getter
@Setter
public class UpdateProductReq extends AbstractHttpSpecification {

    @Setter
    private transient Integer id;

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

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.PUT;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.JSONPLACEHOLDER_API + "/categories/" + id;
    }
}
