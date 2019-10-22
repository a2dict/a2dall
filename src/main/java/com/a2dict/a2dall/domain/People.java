package com.a2dict.a2dall.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by a2dict on 2019/10/22
 */
@Entity
@Data
@Accessors(chain = true)
@Table(name = "people")
public class People {
    @Id
    private String id;
    private String name;
}
