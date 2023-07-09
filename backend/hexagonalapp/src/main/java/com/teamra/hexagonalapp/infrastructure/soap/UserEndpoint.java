package com.teamra.hexagonalapp.infrastructure.soap;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.teamra.hexagonalapp.application.IUserService;
import com.teamra.hexagonalapp.application.dto.FindUserRequest;
import com.teamra.hexagonalapp.application.dto.FindUserResponse;
import com.teamra.hexagonalapp.domain.model.User;

@Endpoint
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://www.teamr4.pe/xml/hexagonal";

	private final IUserService userService;

	public UserEndpoint(IUserService userService) {
		this.userService = userService;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "FindUserRequest")
	@ResponsePayload
	public FindUserResponse findUserById(@RequestPayload FindUserRequest request) {

        User user = userService.findUserById(request.getIdUser());
		FindUserResponse response = new FindUserResponse();
        response.setIdUser(user.getIdUsuario());
        response.setName(user.getNombres());
        response.setLastname(user.getApellidos());

		return response;
	}
    
}
