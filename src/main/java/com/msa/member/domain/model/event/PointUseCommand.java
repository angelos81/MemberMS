package com.msa.member.domain.model.event;

import com.msa.member.domain.model.vo.IDName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PointUseCommand {
    private IDName idName;
    private long point;
}
