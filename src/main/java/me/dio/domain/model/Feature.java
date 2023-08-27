package me.dio.domain.model;

import jakarta.persistence.Entity;

import java.io.Serial;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {

    @Serial
    private static final long serialVersionUID = -5623623496807011930L;
}