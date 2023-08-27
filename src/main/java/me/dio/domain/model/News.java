package me.dio.domain.model;

import jakarta.persistence.Entity;

import java.io.Serial;

@Entity(name = "tb_news")
public class News extends BaseItem {

    @Serial
    private static final long serialVersionUID = 3853530097265895706L;
}