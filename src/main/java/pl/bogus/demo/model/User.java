package pl.bogus.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import java.util.UUID;

public class User {

    private final UUID id;

    @NotNull
    private final String name;

    @NotNull
    private final String email;
    @NotNull
    //@JsonIgnore
    private final String password;

    public User(@JsonProperty("id") UUID id
            , @JsonProperty("name") String name
            , @JsonProperty("email") String email
            , @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
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
}
