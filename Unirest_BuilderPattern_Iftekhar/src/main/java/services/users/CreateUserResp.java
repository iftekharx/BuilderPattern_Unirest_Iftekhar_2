package services.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CreateUserResp{

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("role")
    private String role;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("id")
    private int id;

}
