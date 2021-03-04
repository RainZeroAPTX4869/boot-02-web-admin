package com.rain.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/03/03 15:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String pwd;
}
