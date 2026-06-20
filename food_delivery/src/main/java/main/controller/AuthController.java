package main.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.PermitAll;
import main.dto.AuthResponse;
import main.dto.UserDTO;
import main.dto.UserLoginDTO;
import main.service.UserService;
import main.utils.TokenUtils;



@RestController
@RequestMapping("/api/auth")
@PermitAll
public class AuthController {
	@Autowired
	private TokenUtils tokenUtils;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private UserService userService;


	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(@RequestBody UserLoginDTO user) {

	    UserDTO u = userService.findByUsername(user.getUsername());

	    if (u == null) {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	    }

	    if (!passwordEncoder.matches(user.getPassword(), u.getPassword())) {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	    }

	    UserDetails userDetails =
	            userDetailsService.loadUserByUsername(user.getUsername());

	    Map<String, Object> claims = new HashMap<>();

	    String token = tokenUtils.generateToken(userDetails, claims);

	    return ResponseEntity.ok(new AuthResponse(token));
	}
	
}

