package com.example.homework05.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data

public class User {

    private Integer id;
    private String username;
    private String address;

}
