package com.onlineshoppy.service;

import java.util.Arrays;
import java.util.List;
import com.onlineshoppy.model.*;
import org.springframework.stereotype.Service;

@Service
public class shoppingService {

	public List<laptop> laptoplist=Arrays.asList(
			new laptop(101,"Asus Tuf Gaming","i5",56000),
			new laptop(102,"Lenovo ideapad 330","i5",42000)
			);
	
	
	public List<laptop> getAllLaptops() {
		return laptoplist;
	}
	
	
}
