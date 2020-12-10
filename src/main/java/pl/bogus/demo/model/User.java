package pl.bogus.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name="users")
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

    public UUID getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
