package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @WebName: User
 * @Description: TODO
 * @author: Chen Long
 * @date: 2020/6/23  20:36
 * “Welcome,my master”
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uid;

    private String phone;

    private String email;

    private String realName;

    private String password;

    private Integer level;
}
