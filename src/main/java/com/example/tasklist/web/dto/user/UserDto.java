package com.example.tasklist.web.dto.user;

import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Data
@Schema(description = "User DTO")
public class UserDto {
    @Schema(name="User id", example = "1")
    @NotNull(message = "id must be not null", groups = OnUpdate.class)
    private Long id;

    @Schema(name = "username", example = "John Doe")
    @NotNull(message = "Name name must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name length must be less than 225", groups = {OnUpdate.class, OnCreate.class})
    private String name;

    @Schema(name = "User email", example = "johndoe@gmail.com")
    @NotNull(message = "Username name must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Username length must be less than 225", groups = {OnUpdate.class, OnCreate.class})
    private String username;

    @Schema(name="User encrypted password", example = "$2a$12$vo0VuXWAM6CmHXm9RhltDO8is0UBaizD3Es0eNsFZbWRdx84pa312")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message="Enter password", groups = {OnUpdate.class, OnCreate.class})
    private String password;


    @Schema(name="User encrypted password confirmation", example = "$2a$12$vo0VuXWAM6CmHXm9RhltDO8is0UBaizD3Es0eNsFZbWRdx84pa312")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message="Enter password", groups = {OnCreate.class})
    private String passwordConfiguration;
}
