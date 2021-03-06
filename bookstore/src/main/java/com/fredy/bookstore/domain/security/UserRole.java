package com.fredy.bookstore.domain.security;

import com.fredy.bookstore.domain.User;

import javax.persistence.*;


import java.io.Serializable;

@Entity
@Table(name="user_role")
public class UserRole implements Serializable{
    private static final long serialVersionUID = 123124L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Role role;

    public UserRole(User user , Role role) {
        this.user = user;
        this.role = role;
    }

    public UserRole(){}


    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
