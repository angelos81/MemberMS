package com.msa.member.application.inputport;

import com.msa.member.application.outputport.MemberOutPutPort;
import com.msa.member.application.usecase.SavePointUsecase;
import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.vo.IDName;
import com.msa.member.framework.web.dto.MemberOutPutDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SavePointInputPort implements SavePointUsecase {

    private final MemberOutPutPort memberOutPutPort;

    @Override
    public MemberOutPutDTO savePoint(IDName idName, Long point) {
        Member loadMember = memberOutPutPort.loadMemberByIdName(idName);
        loadMember.savePoint(point);
        return MemberOutPutDTO.mapToDTO(loadMember);
    }
}
