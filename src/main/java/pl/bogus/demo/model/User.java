package pl.bogus.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;
/*some keyword in postgres - "user" wasn't accepted"*/
@Table(name="users")
@Getter
@Setter
@Entity
public class User {
    @Id
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private  String email;
    @NotNull
    //@JsonIgnore
    private String password;

    public User(@JsonProperty("id") UUID id
            , @JsonProperty("name") String name
            , @JsonProperty("email") String email
            , @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

}
