package com.stalixo.charsheetspring.resources;

import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.dto.request.UserRequestDTO;
import com.stalixo.charsheetspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserRequestDTO>> findAll() {
        List<User> list = service.findAll();
        List<UserRequestDTO> listDTO = list.stream().map(UserRequestDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserRequestDTO> findById(@PathVariable String id) {
        UserRequestDTO obj = new UserRequestDTO(service.findById(id));
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody UserRequestDTO userDTO) {
        User obj = service.fromDTO(userDTO);
        obj.setId(id);
        service.update(obj);
        return ResponseEntity.noContent().build();
    }
}
