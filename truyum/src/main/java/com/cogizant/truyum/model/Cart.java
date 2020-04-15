package com.cogizant.truyum.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Cart {

	private List<MenuItem> menuItemList;
	private double total;
	
}
