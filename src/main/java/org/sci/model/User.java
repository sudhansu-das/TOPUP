package org.sci.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "users", uniqueConstraints = {
@UniqueConstraint(columnNames = {
"username"
}),
@UniqueConstraint(columnNames = {
"email"
})
})
public class User{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank
@Size(min=3, max = 50)
private String name;

@NotBlank
@Size(min=3, max = 50)
private String username;

@NaturalId
@NotBlank
@Size(max = 50)
@Email
private String email;

@NotBlank
@Size(min=6, max = 100)
private String password;

@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "user_roles", 
joinColumns = @JoinColumn(name = "user_id"), 
inverseJoinColumns = @JoinColumn(name = "role_id"))
private Set<Role> roles = new HashSet<>();
@NotBlank
private String roleId;
@NotBlank
@Size(min=3, max = 50)
private String designation;

public User() {}

public User(String name, String username, String email, String password,String roleId,String desgn) {
this.name = name;
this.username = username;
this.email = email;
this.password = password;
this.roleId=roleId;
this.designation=desgn;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getRoleId() {
	return roleId;
}

public void setRoleId(String roleId) {
	this.roleId = roleId;
}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public Set<Role> getRoles() {
return roles;
}

public void setRoles(Set<Role> roles) {
this.roles = roles;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password="
			+ password + ", roles=" + roles + ", roleId=" + roleId + ", designation=" + designation + "]";
}

}