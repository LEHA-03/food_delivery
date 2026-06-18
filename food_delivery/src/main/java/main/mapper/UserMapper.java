package main.mapper;

import main.dto.UserDTO;
import main.model.User;

public class UserMapper {

	public UserMapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO mapToDto(User user) {
		
		UserDTO dto = new UserDTO();
		
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setUsername(user.getUsername());
		dto.setPassword(user.getPassword());
		dto.setRole(user.getRole());
		
		return dto;
	}
	
	public User mapToEntity(UserDTO dto) {
		
		User user = new User();
		
		user.setId(dto.getId());
		user.setName(dto.getName());
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setRole(dto.getRole());
		
		return user;
	}
	
	
}
