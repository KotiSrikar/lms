package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Skills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillId;
	
	private String skillName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mentor_fk")
	private Mentor mentor;
}
