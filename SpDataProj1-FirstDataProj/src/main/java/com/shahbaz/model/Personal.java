package com.shahbaz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="PERSONAL_TAB")
@RequiredArgsConstructor
@NoArgsConstructor
public class Personal {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="P_ID")
	private Integer pid;
	
	@Column(name="P_NAME",length=30)
	@NonNull
	private String pname;
	
	@Column(name="IS_EMPLOYED")
	@NonNull
	private Boolean isEmployed;
	
	@Column(name="P_INCOME")
	@NonNull
	private Double income;
	
	@Column(name="P_ADDRESS",length=30)
	@NonNull
	private String address;
}
