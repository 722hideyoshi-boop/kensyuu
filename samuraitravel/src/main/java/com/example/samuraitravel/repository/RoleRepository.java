package com.example.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// ここでRoleエンティティの正確な場所を指定します
import com.example.samuraitravel.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByName(String name);

}