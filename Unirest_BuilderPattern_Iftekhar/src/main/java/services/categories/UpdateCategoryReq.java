package services.categories;


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
public class UpdateCategoryReq extends AbstractHttpSpecification {

    @Setter
    private transient Integer id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("image")
    @Expose
    public String image;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.PUT;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.JSONPLACEHOLDER_API + "/categories/" + id;
    }
}
