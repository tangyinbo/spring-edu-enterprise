package com.cowboy.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Auther: cowboy
 * @Date: 2019/3/15 16:26
 * @Description:
 */
@Component
@Data
public class Student extends Human {
    private String classname;

}
