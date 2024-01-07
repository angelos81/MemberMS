package com.msa.member.domain.model.event;

import com.msa.member.domain.model.vo.IDName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ItemRented implements Serializable {
    private static final long serialVersionUID = -2956792577262963815L;

    private IDName idName;
    private Item item;
    private long point;
}
