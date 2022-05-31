package hu.webuni.logistics.Jozsi.security;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import hu.webuni.logistics.Jozsi.model.TransportPlanUser;
import hu.webuni.logistics.Jozsi.repository.UserRepository;

public class TransportPlanUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TransportPlanUser transportPlanUser = userRepository.findById(username)
				.orElseThrow(()-> new UsernameNotFoundException(username));
		
		
		return new User(username, transportPlanUser.getPassword(), 
				transportPlanUser.getRoles().stream().map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList()));
	}

}
