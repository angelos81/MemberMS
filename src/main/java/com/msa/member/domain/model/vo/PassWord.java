package com.msa.member.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PassWord {
    private String presentPWD;
    private String pastPWD;

    // 후에 패스워드 검증하는 로직등을 넣으면 됨

}
