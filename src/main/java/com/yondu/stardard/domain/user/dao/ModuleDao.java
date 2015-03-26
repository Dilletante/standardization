package com.yondu.stardard.domain.user.dao;

import java.util.List;

import com.yondu.stardard.domain.user.Module;

public interface ModuleDao {

	public Module create(Module module);
	
	public Module update(Module module);
	
	public Module getModule(Long id);
	
	public List<Module> getAllModules();
	
//	public List<Module> getAllModulesBy();
	
	public Boolean delete(Long id);
}
