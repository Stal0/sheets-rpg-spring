package com.stalixo.charsheetspring.services;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.dto.UserDTO;
import com.stalixo.charsheetspring.repositories.SheetRepository;
import com.stalixo.charsheetspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User update(User obj) {
        Optional<User> newObj = repo.findById(obj.getId());
        updateData(newObj.get(), obj);
        return repo.save(newObj.get());
    }

    public User fromDTO(UserDTO objDTO) {
        return new User(objDTO.getId(), objDTO.getUsername(), objDTO.getEmail());
    }

    private void updateData(User user, User obj) {
        user.setUsername(obj.getUsername());
        user.setEmail(obj.getEmail());
    }
}
