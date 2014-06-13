package com.mission.shop.admin.dao.mapper.manage.role;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.mission.shop.admin.dao.entity.manage.role.MenuEntity;
import com.mission.shop.admin.dao.entity.manage.role.MenuRoleEntity;
import com.mission.shop.admin.dao.manage.model.role.MenuRoleModel;

public interface IMenuRoleMapper {

	public List<MenuEntity> queryMenuRoles(String roleCode) throws SQLException;

	public List<MenuEntity> queryUserMenus(Map<String, Object> condition)
			throws SQLException;
	
	public List<MenuRoleEntity> searchMenuRoles(String roleCode) throws SQLException;
	
	public void deleteMenuRoles(String[] roleCodes) throws SQLException;
	
	public void deleteMenuRolesByMenu(String[] menuCodes) throws SQLException;
	
	public void insertMenuRoles(List<MenuRoleEntity> menuroles) throws SQLException;
	
	public List<MenuRoleModel> queryCheckMenus(Map<String, Object> condition) throws SQLException;
}
