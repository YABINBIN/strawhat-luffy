package org.onepiece.luffy.model.user.dal;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by robin on 2019/1/6.
 */
@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roleName;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "role")
    private List<Permission> permissions;

    public Long getId() {
        return id;
    }
}
