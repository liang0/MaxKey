package org.maxkey.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
   ID                   varchar(40)                    not null,
   APPROLEID            varchar(40)                    null,
   UID	                varchar(40)	                   null
   constraint PK_ROLES primary key clustered (ID)
 */
@Table(name = "ROLE_MEMBER")
public class RoleMember extends UserInfo implements Serializable {
    private static final long serialVersionUID = -8059639972590554760L;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
    String id;
    @Column
    private String roleId;
    private String roleName;
    @Column
    private String memberId;
    private String memberName;
    @Column
    private String type;// User or Roles

    public RoleMember() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RoleMember(String roleId, String memberId, String type) {
        super();
        this.roleId = roleId;
        this.memberId = memberId;
        this.type = type;
    }

    
    public RoleMember(String roleId, String roleName, String memberId, String memberName, String type) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
        this.memberId = memberId;
        this.memberName = memberName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "RoleMember [id=" + id + ", roleId=" + roleId + ", roleName=" + roleName + ", memberId=" + memberId
                + ", memberName=" + memberName + ", type=" + type + "]";
    }

}
