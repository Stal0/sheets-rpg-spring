package com.stalixo.charsheetspring.resources;

import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.dto.request.UserRequestDTO;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import com.stalixo.charsheetspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        List<User> list = service.findAll();
        List<UserResponseDTO> listDTO = list.stream().map(UserResponseDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserResponseDTO> findById(@PathVariable String id) {
        UserResponseDTO obj = new UserResponseDTO(service.findById(id));
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody UserRequestDTO userRequestDTO) {
        User user = new User(null, userRequestDTO.getUsername(), userRequestDTO.getEmail(), userRequestDTO.getPassword());
        service.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody UserRequestDTO userDTO) {
        User obj = new User(null, userDTO.getUsername(), userDTO.getEmail(), userDTO.getPassword());
        obj.setId(id);
        service.update(obj);
        return ResponseEntity.noContent().build();
    }
}
