package com.eidiko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eidiko.controller.entity.Eidiko;

public interface EidikoDao extends JpaRepository<Eidiko,Integer> {

}
