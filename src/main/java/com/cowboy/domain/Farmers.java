package com.cowboy.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Auther: cowboy
 * @Date: 2019/3/15 16:27
 * @Description:
 */
@Component
@Data
public class Farmers extends Human {
    private String address;
}
