package com.pickdata.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_credits")
@Data
public class CreditDO {

	@Id
	private Integer id;
	private Integer result;
	private BigDecimal score;
	
}