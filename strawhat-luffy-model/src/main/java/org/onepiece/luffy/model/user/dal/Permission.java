package org.onepiece.luffy.model.user.dal;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by robin on 2019/1/6.
 */
@Entity
@Data
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String permission;
    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;
}
