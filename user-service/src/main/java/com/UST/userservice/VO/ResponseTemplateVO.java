package com.UST.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;


import com.UST.userservice.entity.User;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
