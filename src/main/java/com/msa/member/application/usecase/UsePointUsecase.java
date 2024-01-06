package com.msa.member.application.usecase;

import com.msa.member.domain.model.vo.IDName;
import com.msa.member.framework.web.dto.MemberOutPutDTO;

public interface UsePointUsecase {
    public MemberOutPutDTO usePoint(IDName idName, Long point) throws Exception;
}
