package com.msa.member.domain.model;

import com.msa.member.domain.model.vo.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long MemberNo;

    @Embedded
    private IDName idName;

    @Embedded
    private PassWord password;

    @Embedded
    private Email email;

    @ElementCollection
    private List<Authority> authorites = new ArrayList<Authority>();

    @Embedded
    private Point point;

    public static Member createMember(IDName idName, PassWord passWord, Email email) {
        Member member = new Member();
        member.setIdName(idName);
        member.setPassword(passWord);
        member.setEmail(email);
        member.setPoint(Point.createPoint());
        member.addAuthority(new Authority(UserRole.USER));
        return member;
    }

    private void addAuthority(Authority authority) {
        this.authorites.add(authority);
    }

    public void savePoint(Long point) {
        this.point.addPoint(point);
    }

    public void usePoint(Long point) throws Exception {
        this.point.removePoint(point);
    }

    // 미사용 기능으로 틀만 만듦
    public Member login(IDName idName, PassWord passWord) {
        return this;
    }

    public void logout(IDName idName) {

    }
}
