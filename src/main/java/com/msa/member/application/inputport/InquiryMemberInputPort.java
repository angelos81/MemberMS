package com.msa.member.application.inputport;

import com.msa.member.application.outputport.MemberOutPutPort;
import com.msa.member.application.usecase.InquiryMemberUsecase;
import com.msa.member.domain.model.Member;
import com.msa.member.framework.web.dto.MemberOutPutDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InquiryMemberInputPort implements InquiryMemberUsecase {
    private final MemberOutPutPort memberOutPutPort;

    @Override
    public MemberOutPutDTO getMember(long memberNo) {
        Member member = memberOutPutPort.loadMember(memberNo);
        return MemberOutPutDTO.mapToDTO(member);
    }
}
