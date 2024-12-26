package com.cg.entity;

import lombok.Data;

@Data
public class TransferParam {
    private String accountA;
    private String accountB;
    private double money;
}
