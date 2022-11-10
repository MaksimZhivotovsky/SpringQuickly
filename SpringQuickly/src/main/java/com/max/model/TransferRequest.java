package com.max.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TransferRequest {

	private long senderBookId;
	 private long receiverBookId;
	 private BigDecimal pages;
}
