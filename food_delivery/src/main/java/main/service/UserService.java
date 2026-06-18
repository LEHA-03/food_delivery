package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.UserDTO;
import main.mapper.UserMapper;
import main.model.User;
import main.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	public List<UserDTO> findAll() {
		List<User> users = (List<User>) userRepository.findAll();
		return users.stream()
				.map(userMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public UserDTO findById(String id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return userMapper.mapToDto(user);
    }
    
    public UserDTO findByUsername(String username) {

		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new RuntimeException("User not found"));

		return userMapper.mapToDto(user);
	}
    
    public UserDTO saveUser(UserDTO userDTO) {
		User user = userMapper.mapToEntity(userDTO);
		User savedUser = userRepository.save(user);
		return userMapper.mapToDto(savedUser);
	}
    
    public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
    
    public UserDTO updateUser(String id, UserDTO userDTO) {
    	UserDTO dto = findById(id);
    	dto.setName(userDTO.getName());
    	dto.setUsername(userDTO.getUsername());
    	dto.setPassword(userDTO.getPassword());
    	dto.setRole(userDTO.getRole());
    	
    	User user = userMapper.mapToEntity(dto);
    	User updatedUser = userRepository.save(user);
    	return userMapper.mapToDto(updatedUser);
    	
    }
    
	
}
